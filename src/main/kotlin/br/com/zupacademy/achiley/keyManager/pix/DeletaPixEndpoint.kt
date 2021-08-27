package br.com.zupacademy.achiley.keyManager.pix

import br.com.zupacademy.achiley.DeletaPixRequest
import br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc
import br.com.zupacademy.achiley.keyManager.shared.exceptions.ForbiddenException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.NotFoundException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler
import com.google.protobuf.Empty
import io.grpc.stub.StreamObserver
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory

@Singleton
@ErrorHandler
class DeletaPixEndpoint(val repository: ChavePixRepository) :
    KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceImplBase() {
    private val log = LoggerFactory.getLogger(CadastroPixEndpoint::class.java)

    override fun deletar(request: DeletaPixRequest?, responseObserver: StreamObserver<Empty>?) {
        log.info("Nova tentativa de deleção de pix para o cliente id ${request!!.clienteId}")

        if (!repository.existsByClienteId(request.clienteId)) {
            log.warn("Cliente id ${request.clienteId} nao encontrado")
            throw NotFoundException("Cliente id não encontrado")
        }

        val chavePix = repository.findById(request.pixId).orElseThrow {
            log.warn("Chave pix ${request.pixId} nao encontrada")
            throw NotFoundException("Chave pix não encontrada")
        }

        if (!chavePix.pertenceAoClienteId(request.clienteId)) {
            log.warn("O pix id ${chavePix.pixId} nao pertence ao cliente id ${request.clienteId}")
            throw ForbiddenException("Você não tem autorização para deletar esta chave pix!")
        }

        repository.deleteById(chavePix.pixId)
        log.info("Chave Pix ${chavePix.pixId} deletada com sucesso.")

        responseObserver!!.onNext(Empty.getDefaultInstance())
        responseObserver.onCompleted()
    }

}