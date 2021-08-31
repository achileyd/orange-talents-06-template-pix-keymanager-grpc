    package br.com.zupacademy.achiley.keyManager.integracoes

import br.com.zupacademy.achiley.TipoDeContaEnum

data class ItauClientCorroboracaoResponse(
    val tipo: TipoDeContaEnum,
    val instituicao: ItauInstituicaoResponse,
    val agencia: String,
    val numero: String,
    val titular: ItauTitularResponse,
) {
    fun getIspbDaIntituicao(): String {
        return this.instituicao.ispb
    }

    fun getCpfDoTitular(): String {
        return this.titular.cpf
    }

    fun getNomeDoTitular(): String {
        return this.titular.nome
    }
}

data class ItauInstituicaoResponse(
    val nome: String,
    val ispb: String,
)

data class ItauTitularResponse(
    val id: String,
    val cpf: String,
    val nome: String,
)