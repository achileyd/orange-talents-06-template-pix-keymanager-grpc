package br.com.zupacademy.achiley.keyManager.integracoes.bcb

import br.com.zupacademy.achiley.keyManager.integracoes.BcbClientCriaChaveResponse
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.BcbClientDeletaChaveRequest
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.BcbClientDeletaChaveResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@Client("\${bcb.client.url}/pix/keys")
interface BcbClient {

    @Post(produces = [MediaType.APPLICATION_XML])
    fun criaChave(@Body request: BcbClientCriaChaveRequest): BcbClientCriaChaveResponse

    @Delete("/{chave}", produces = [MediaType.APPLICATION_XML] )
    fun deletaChave(@PathVariable("chave") chave: String, @Body bcbRequest: BcbClientDeletaChaveRequest): BcbClientDeletaChaveResponse
}