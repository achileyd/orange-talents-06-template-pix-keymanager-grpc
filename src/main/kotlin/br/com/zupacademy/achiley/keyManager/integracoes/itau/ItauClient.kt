package br.com.zupacademy.achiley.keyManager.integracoes.itau

import br.com.zupacademy.achiley.TipoDeContaEnum
import br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

@Client("\${itau.client.url}/clientes")
interface ItauClient {

    @Get("/{clienteId}/contas")
    fun corroborarDados(@PathVariable("clienteId") clienteId: String, @QueryValue("tipo") tipoDeConta: TipoDeContaEnum): HttpResponse<ItauClientCorroboracaoResponse>

    @Get("/{clienteId}")
    fun buscaClientePeloId(@PathVariable("clienteId") clienteId: String): ItauClientDadosDoClienteResponse
}