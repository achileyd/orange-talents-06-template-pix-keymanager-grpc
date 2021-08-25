package br.com.zupacademy.achiley.keyManager.pix

import br.com.zupacademy.achiley.*
import br.com.zupacademy.achiley.TipoDeChaveEnum
import br.com.zupacademy.achiley.keyManager.integracoes.CorroboradorDeDadosItau
import br.com.zupacademy.achiley.keyManager.shared.exceptions.AlreadyExistsException
import br.com.zupacademy.achiley.keyManager.shared.validators.ValidadorDePix
import br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler
import io.grpc.stub.StreamObserver
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
import java.lang.IllegalArgumentException
import java.util.*

@Singleton
@ErrorHandler
class CadastroPixEndpoint(
    val repository: ChavePixRepository,
    @Inject val corroborador: CorroboradorDeDadosItau,
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
        corroborador.corroboraDados(request.clienteId, request.tipoDeConta)

        val chavePix = request.toModel()
        repository.save(chavePix)
        log.info("Pix cadastrado com sucesso. Pix id: ${chavePix.pixId}")

        val response = CadastroPixResponse.newBuilder().setPixId(chavePix.pixId).build()
        responseObserver!!.onNext(response)
        responseObserver.onCompleted()
    }
}

fun CadastroPixRequest.toModel(): ChavePix {
    when {
        tipoDeConta == TipoDeContaEnum.UNRECOGNIZED_ACCOUNT -> throw IllegalArgumentException("Tipo de conta invalido")
        tipoDeChave == TipoDeChaveEnum.RANDOM -> {
            return ChavePix(this.tipoDeChave, criaChaveRandom(), this.clienteId, this.tipoDeConta)
        }
    }
    return ChavePix(this.tipoDeChave, this.chave, this.clienteId, this.tipoDeConta)
}

fun criaChaveRandom(): String {
    val chaveRandom = UUID.randomUUID().toString();
    return chaveRandom
}