package br.com.zupacademy.achiley.keyManager.integracoes

import br.com.zupacademy.achiley.TipoDeChaveEnum
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.TipoDeContaBcbEnum
import br.com.zupacademy.achiley.keyManager.integracoes.bcb.TipoDePessoaBcbEnum
import java.time.LocalDateTime
import javax.xml.bind.annotation.XmlElement

data class BcbClientCriaChaveResponse(
    val keyType: TipoDeChaveEnum,
    val key: String,
    val bankAccount: BcbBancoEContaResponse,
    val owner: BcbTitularResponse,
    val createdAt: LocalDateTime

) {

}
data class BcbBancoEContaResponse(
    val participant: String,
    val accountType: TipoDeContaBcbEnum,
    val branch: String,
    val accountNumber: String
)

data class BcbTitularResponse(
    val type: TipoDePessoaBcbEnum,
    val taxIdNumber: String,
    val name: String,
)