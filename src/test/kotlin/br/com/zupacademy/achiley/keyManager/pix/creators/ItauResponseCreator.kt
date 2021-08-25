package br.com.zupacademy.achiley.keyManager.pix.creators

import br.com.zupacademy.achiley.TipoDeContaEnum
import br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse
import br.com.zupacademy.achiley.keyManager.integracoes.ItauInstituicaoResponse
import br.com.zupacademy.achiley.keyManager.integracoes.ItauTitularResponse

fun criaItauResponse(clienteId: String, tipoDeConta: TipoDeContaEnum): ItauClientCorroboracaoResponse {
    return ItauClientCorroboracaoResponse(
        tipo = tipoDeConta,
        instituicao = criaIstituicao(),
        agencia = "0001",
        numero = "085350",
        titular = criaTitular()
    )
}

fun criaIstituicao(): ItauInstituicaoResponse {
    return ItauInstituicaoResponse(
        nome = "ITAÚ UNIBANCO S.A.",
        ispb = "60701190"
    )
}

fun criaTitular(): ItauTitularResponse {
    return ItauTitularResponse(
        id = "b3af3798-d24d-43b1-b3e1-0846bbdb8097",
        cpf = "95645043090",
        nome = "Son Goku"
    )
}
