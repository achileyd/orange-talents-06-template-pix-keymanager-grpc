package br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete

import br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClient
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.BcbClientDeletaChaveRequest
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.BcbClientDeletaChaveResponse
import br.com.zupacademy.achiley.keyManager.shared.exceptions.ClientErrorException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.NotFoundException
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.exceptions.HttpClientResponseException
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory

@Singleton
class DeletadorDeChaveBcb(
    @Inject val bcbClient: BcbClient
) {
    private val log = LoggerFactory.getLogger(DeletadorDeChaveBcb::class.java)

    fun deletaChave(request: BcbClientDeletaChaveRequest): BcbClientDeletaChaveResponse {
        try {
            log.info("Deletando chave pix junto ao BCB")
            return bcbClient.deletaChave(request.key, request)
        } catch (e: HttpClientResponseException) {
            when (e.status) {
                HttpStatus.NOT_FOUND -> {
                    log.warn("Chave pix nao encontrada")
                    throw NotFoundException("Chave pix nao encontrada!")
                }
                else -> {
                    log.error("Erro ao tentar deletar a chave junto ao BCB. Status: ${e.status}, Message: ${e.message}")
                    throw ClientErrorException("Nao foi possivel deletar a chave nesse momento.")
                }
            }
        }
    }
}