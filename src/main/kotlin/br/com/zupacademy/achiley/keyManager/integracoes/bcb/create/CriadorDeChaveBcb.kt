package br.com.zupacademy.achiley.keyManager.integracoes.bcb.create

import br.com.zupacademy.achiley.keyManager.integracoes.BcbClientCriaChaveResponse
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClient
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClientCriaChaveRequest
import br.com.zupacademy.achiley.keyManager.shared.exceptions.AlreadyExistsException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.ClientErrorException
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.exceptions.HttpClientResponseException
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
@Singleton
class CriadorDeChaveBcb(@Inject private val bcbClient: BcbClient) {
    private val log = LoggerFactory.getLogger(CriadorDeChaveBcb::class.java)

    fun criaChave(request: BcbClientCriaChaveRequest): BcbClientCriaChaveResponse {
        try {
            log.info("Cadastrando chave pix junto ao BCB")
            return bcbClient.criaChave(request)
        } catch (e: HttpClientResponseException) {
            when (e.status) {
                HttpStatus.UNPROCESSABLE_ENTITY -> {
                    log.warn("Chave pix ja cadastrada")
                    throw AlreadyExistsException("Chave pix já está cadastrada")
                }
                else -> {
                    log.error("Erro ao tentar criar a chave junto ao BCB. Status: ${e.status}, Message: ${e.message}")
                    throw ClientErrorException("Nao foi possivel realizar o cadastro nesse momento.")
                }
            }
        }
    }
}