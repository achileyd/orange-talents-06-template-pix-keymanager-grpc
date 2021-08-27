package br.com.zupacademy.achiley.keyManager.pix

import br.com.zupacademy.achiley.DeletaPixRequest
import br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc
import br.com.zupacademy.achiley.TipoDeContaEnum
import br.com.zupacademy.achiley.TipoDeChaveEnum
import io.grpc.ManagedChannel
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import io.micronaut.grpc.server.GrpcServerChannel
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Singleton
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@MicronautTest(transactional = false)
internal class DeletaPixEndpointTest(
    val grpcClient: KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceBlockingStub,
    val repository: ChavePixRepository,
) {
    lateinit var chaveExistente: ChavePix
    lateinit var chaveDeOutroDono: ChavePix

    @BeforeEach
    fun setUp() {
        this.chaveExistente = repository.save(
            ChavePix(
                TipoDeChaveEnum.EMAIL,
                "goku@email.com",
                "b3af3798-d24d-43b1-b3e1-0846bbdb8097",
                TipoDeContaEnum.CONTA_POUPANCA
            )
        )
        this.chaveDeOutroDono = repository.save(
            ChavePix(
                TipoDeChaveEnum.RANDOM,
                "",
                "c532e973-e002-4844-87b6-217412c61afa",
                TipoDeContaEnum.CONTA_POUPANCA
            )
        )

    }
    @Test
    fun `deve deletar uma chave pix`() {
        val request = DeletaPixRequest.newBuilder()
            .setClienteId("b3af3798-d24d-43b1-b3e1-0846bbdb8097")
            .setPixId(chaveExistente.pixId)
            .build()

        val response = grpcClient.deletar(request)

        with(response) {
            assertEquals(chaveExistente.pixId, request.pixId)
            assertEquals(chaveExistente.clienteId, request.clienteId)
            assertFalse(repository.existsById(request.pixId))
        }
    }

    @Test
    fun `nao deve deletar uma chave pix quando cliente id nao for encontrado`() {
        val request = DeletaPixRequest.newBuilder()
            .setClienteId("123456")
            .setPixId(chaveExistente.pixId)
            .build()

        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.deletar(request)
        }

        with(erro) {
            assertEquals(Status.NOT_FOUND.code, this.status.code)
            assertTrue(repository.existsById(request.pixId))
        }
    }

    @Test
    fun `nao deve deletar uma chave pix quando o pix id nao for encontrado`() {
        val request = DeletaPixRequest.newBuilder()
            .setClienteId("b3af3798-d24d-43b1-b3e1-0846bbdb8097")
            .setPixId("123456")
            .build()

        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.deletar(request)
        }

        with(erro) {
            assertEquals(Status.NOT_FOUND.code, this.status.code)
            assertTrue(repository.existsById(chaveExistente.pixId))
        }
    }

    @Test
    fun `nao deve deletar uma chave pix quando o cliente id nao for o dono daquela pix id`() {
        val request = DeletaPixRequest.newBuilder()
            .setClienteId("b3af3798-d24d-43b1-b3e1-0846bbdb8097")
            .setPixId(chaveDeOutroDono.pixId)
            .build()

        val erro = assertThrows<StatusRuntimeException> {
            grpcClient.deletar(request)
        }

        with(erro) {
            assertEquals(Status.PERMISSION_DENIED.code, this.status.code)
            assertTrue(repository.existsById(chaveDeOutroDono.pixId))
        }
    }

    @AfterEach
    fun tearDown() {
        repository.deleteAll()
    }

    @Factory
    class GrpcForDeleteTest {
        @Singleton
        fun blockingStub(@GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel): KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceBlockingStub? {
            return KeyManagerDeleteServiceGrpc.newBlockingStub(channel)
        }
    }

}
