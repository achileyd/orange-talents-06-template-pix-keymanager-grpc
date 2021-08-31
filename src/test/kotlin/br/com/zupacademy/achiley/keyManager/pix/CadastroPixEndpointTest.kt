package br.com.zupacademy.achiley.keyManager.pix

import br.com.zupacademy.achiley.CadastroPixRequest
import br.com.zupacademy.achiley.KeyManagerGrpcServiceGrpc
import br.com.zupacademy.achiley.TipoDeChaveEnum
import br.com.zupacademy.achiley.TipoDeContaEnum
import br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient
import br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse
import br.com.zupacademy.achiley.keyManager.pix.creators.criaItauResponse
import io.grpc.ManagedChannel
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import io.micronaut.grpc.server.GrpcServerChannel
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Singleton
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.BDDMockito
import org.mockito.Mockito

@MicronautTest(transactional = false)
internal class CadastroPixEndpointTest(
    val grpcClient: KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub,
    val repository: ChavePixRepository,
    val itauClient: ItauClient,
) {

    @BeforeEach
    fun setUp() {
        repository.deleteAll()
    }

    @Test
    fun `deve cadastrar uma nova chave pix com tipo de chave email`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.EMAIL)
            .setChave("goku@email.com")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_CORRENTE)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)

        val response = grpcClient.cadastrar(novaChave)

        with(response) {
            assertNotNull(pixId)
            assertTrue(repository.existsById(pixId))
        }
    }

    @Test
    fun `deve cadastrar uma nova chave pix com tipo de chave random`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.RANDOM)
            .setChave("")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_CORRENTE)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)

        val response = grpcClient.cadastrar(novaChave)

        with(response) {
            assertNotNull(pixId)
            assertTrue(repository.existsById(pixId))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix com tipo de chave random e campo chave preenchido`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.RANDOM)
            .setChave("UnoDosTres")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_CORRENTE)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)

        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.INVALID_ARGUMENT.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix com tipo de chave unrecognized key`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.UNRECOGNIZED_KEY)
            .setChave("")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_CORRENTE)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)


        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.INVALID_ARGUMENT.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix com tipo de conta unregonized account`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.PHONE)
            .setChave("+5569981771835")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.UNRECOGNIZED_ACCOUNT)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)


        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.INVALID_ARGUMENT.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix com formato de celular invalido`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.PHONE)
            .setChave("123456789")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_POUPANCA)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)


        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.INVALID_ARGUMENT.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix com formato de email invalido`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.EMAIL)
            .setChave("gokuemail.com")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_POUPANCA)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)


        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.INVALID_ARGUMENT.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix com formato de cpf invalido`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.CPF)
            .setChave("123456789")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_POUPANCA)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)


        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.INVALID_ARGUMENT.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix duplicada`() {
        repository.save(
            ChavePix(
                TipoDeChaveEnum.EMAIL,
                "goku@email.com",
                "de95a228-1f27-4ad2-907e-e5a2d816e9bc",
                TipoDeContaEnum.CONTA_POUPANCA
            )
        )

        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.EMAIL)
            .setChave("goku@email.com")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_POUPANCA)
            .build()

        val itauResponse = mockItauClientResponse(novaChave)


        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.ALREADY_EXISTS.code, this.status.code)
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix quando o itau client retorna um erro`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.CPF)
            .setChave("72544547006")
            .setClienteId("12")
            .setTipoDeConta(TipoDeContaEnum.CONTA_POUPANCA)
            .build()

        val httpResponse: HttpResponse<Any> = HttpResponse.status(HttpStatus.INTERNAL_SERVER_ERROR)
        BDDMockito.`when`(itauClient.corroborarDados(novaChave.clienteId, novaChave.tipoDeConta))
            .thenThrow(HttpClientResponseException("Internal Error", httpResponse))

        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.UNAVAILABLE.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    @Test
    fun `nao deve cadastrar uma chave pix quando o itau nao encontra os dados`() {
        val novaChave = CadastroPixRequest.newBuilder()
            .setTipoDeChave(TipoDeChaveEnum.CPF)
            .setChave("72544547006")
            .setClienteId("de95a228-1f27-4ad2-907e-e5a2d816e9bc")
            .setTipoDeConta(TipoDeContaEnum.CONTA_POUPANCA)
            .build()

        BDDMockito.`when`(itauClient.corroborarDados(novaChave.clienteId, novaChave.tipoDeConta))
            .thenReturn(HttpResponse.notFound())


        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.cadastrar(novaChave)
        }

        with(erro) {
            assertEquals(Status.NOT_FOUND.code, this.status.code)
            assertFalse(repository.existsByChave(novaChave.chave))
        }
    }

    fun mockItauClientResponse(pixRequest: CadastroPixRequest): ItauClientCorroboracaoResponse {
        val itauResponse = criaItauResponse(pixRequest.clienteId, pixRequest.tipoDeConta)
        BDDMockito.`when`(itauClient.corroborarDados(pixRequest.clienteId, pixRequest.tipoDeConta)).thenReturn(
            HttpResponse.ok(itauResponse)
        )
        return itauResponse
    }

    @MockBean(ItauClient::class)
    fun itauClientMock(): ItauClient {
        return Mockito.mock(ItauClient::class.java)
    }

    @Factory
    class Clients {
        @Singleton
        fun blockingStub(@GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel): KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub? {
            return KeyManagerGrpcServiceGrpc.newBlockingStub(channel)
        }
    }
}