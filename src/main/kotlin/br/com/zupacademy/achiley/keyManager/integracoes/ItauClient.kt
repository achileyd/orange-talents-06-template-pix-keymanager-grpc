package br.com.zupacademy.achiley.keyManager.integracoes

import br.com.zupacademy.achiley.TipoDeContaEnum
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

@Client("\${itau.client.url}/clientes")
abstract class ItauClient {

    @Get("/{clienteId}/contas")
    abstract fun corroborarDados(@PathVariable("clienteId") clientId: String, @QueryValue("tipo") tipoDeConta: TipoDeContaEnum): HttpResponse<ItauClientCorroboracaoResponse>
}