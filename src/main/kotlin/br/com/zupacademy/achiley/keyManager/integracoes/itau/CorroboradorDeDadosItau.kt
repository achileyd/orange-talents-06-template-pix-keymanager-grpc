package br.com.zupacademy.achiley.keyManager.integracoes.itau

import br.com.zupacademy.achiley.TipoDeContaEnum
import br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse
import br.com.zupacademy.achiley.keyManager.shared.exceptions.ClientErrorException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.NotFoundException
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.exceptions.HttpClientResponseException
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory

@Singleton
class CorroboradorDeDadosItau(@Inject private val itauClient: ItauClient) {
    private val log = LoggerFactory.getLogger(CorroboradorDeDadosItau::class.java)

    fun corroboraDados(clienteId: String, tipoDeConta: TipoDeContaEnum): ItauClientCorroboracaoResponse {
        try {
            log.info("Corroborando dados do clienteId $clienteId e tipo de conta $tipoDeConta")
            val response = itauClient.corroborarDados(clienteId, tipoDeConta)

            if (response.status == HttpStatus.NOT_FOUND) {
                log.warn("Dados nao encontrados!")
                throw NotFoundException("Dados inválidos! Por favor, verifique suas informaçoes e tente novamente.")
            }
            return response.body()!!
            log.info("A corroboraçao de dados foi realizada com sucesso. Status retornado: ${response.status}")
        } catch (e: HttpClientResponseException) {
            log.error("Erro ao tentar corroborar os dados. Status: ${e.status}, Message: ${e.message}")
            throw ClientErrorException("Nao foi possivel realizar o cadastro nesse momento.")
        }
    }
}
