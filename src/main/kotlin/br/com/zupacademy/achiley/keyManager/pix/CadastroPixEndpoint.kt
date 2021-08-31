package br.com.zupacademy.achiley.keyManager.pix

import br.com.zupacademy.achiley.*
import br.com.zupacademy.achiley.TipoDeChaveEnum
import br.com.zupacademy.achiley.keyManager.integracoes.BcbClientCriaChaveResponse
import br.com.zupacademy.achiley.keyManager.integracoes.itau.CorroboradorDeDadosItau
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.create.CriadorDeChaveBcb
import br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClientCriaChaveRequest
import br.com.zupacademy.achiley.keyManager.shared.exceptions.AlreadyExistsException
import br.com.zupacademy.achiley.keyManager.shared.validators.ValidadorDePix
import br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler
import io.grpc.stub.StreamObserver
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
import java.lang.IllegalArgumentException

@Singleton
@ErrorHandler
class CadastroPixEndpoint(
    val repository: ChavePixRepository,
    @Inject val corroborador: CorroboradorDeDadosItau,
    @Inject val criadorDeChave: CriadorDeChaveBcb,
    val validador: ValidadorDePix
) : KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase() {
    private val log = LoggerFactory.getLogger(CadastroPixEndpoint::class.java)

    override fun cadastrar(request: CadastroPixRequest?, responseObserver: StreamObserver<CadastroPixResponse>?) {
        log.info("Nova tentativa de cadastro de pix para o cliente id ${request!!.clienteId}")

        validador.valida(request.tipoDeChave, request.chave)

        if (repository.existsByChave(request.chave)) {
            log.warn("Chave pix ${request.chave} ja cadastrada")
            throw AlreadyExistsException("Chave pix ja cadastrada")
        }
        val itauResponse: ItauClientCorroboracaoResponse = corroborador.corroboraDados(request.clienteId, request.tipoDeConta)

        val bcbRequest = BcbClientCriaChaveRequest.new(request, itauResponse)

        val bcbResponse = criadorDeChave.criaChave(bcbRequest)

        val chavePix = request.toModel(bcbResponse)
        repository.save(chavePix)
        log.info("Pix cadastrado com sucesso. Pix id: ${chavePix.pixId}")

        val response = CadastroPixResponse.newBuilder().setPixId(chavePix.pixId).build()
        responseObserver!!.onNext(response)
        responseObserver.onCompleted()
    }
}

fun CadastroPixRequest.toModel(bcbResponse: BcbClientCriaChaveResponse): ChavePix {
    when {
        tipoDeConta == TipoDeContaEnum.UNRECOGNIZED_ACCOUNT -> throw IllegalArgumentException("Tipo de conta invalido")
        tipoDeChave == TipoDeChaveEnum.RANDOM -> {
            return ChavePix(this.tipoDeChave, bcbResponse.key, this.clienteId, this.tipoDeConta)
        }
    }
    return ChavePix(this.tipoDeChave, this.chave, this.clienteId, this.tipoDeConta)
}
