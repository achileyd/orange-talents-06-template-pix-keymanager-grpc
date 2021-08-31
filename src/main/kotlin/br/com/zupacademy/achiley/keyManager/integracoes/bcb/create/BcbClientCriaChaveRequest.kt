package br.com.zupacademy.achiley.keyManager.integracoes.bcb

import br.com.zupacademy.achiley.CadastroPixRequest
import br.com.zupacademy.achiley.TipoDeChaveEnum
import br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

data class BcbClientCriaChaveRequest(
    val keyType: TipoDeChaveEnum,
    val key: String,
    val bankAccount: BcbBancoEContaRequest,
    val owner: BcbTitularRequest
) {
    companion object {
        fun new(
            request: CadastroPixRequest,
            ItauResponse: ItauClientCorroboracaoResponse,
        ): BcbClientCriaChaveRequest {
            return BcbClientCriaChaveRequest(
                request.tipoDeChave,
                request.chave,
                BcbBancoEContaRequest.getDadosBancarios(ItauResponse),
                BcbTitularRequest.getDadosDoTitular(ItauResponse)
            )
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BcbClientCriaChaveRequest

        if (owner != other.owner) return false

        return true
    }

    override fun hashCode(): Int {
        return key.hashCode()
    }

}

data class BcbTitularRequest(
    val type: TipoDePessoaBcbEnum,
    val name: String,
    val taxIdNumber: String
) {
    companion object {
        fun getDadosDoTitular(itauResponse: ItauClientCorroboracaoResponse): BcbTitularRequest {
            return BcbTitularRequest(
                TipoDePessoaBcbEnum.NATURAL_PERSON,
                itauResponse.getNomeDoTitular(),
                itauResponse.getCpfDoTitular()
            )
        }
    }

}

data class BcbBancoEContaRequest(
    val participant: String,
    val branch: String,
    val accountNumber: String,
    val accountType: TipoDeContaBcbEnum
) {
    companion object {
        fun getDadosBancarios(itauResponse: ItauClientCorroboracaoResponse): BcbBancoEContaRequest {
            return BcbBancoEContaRequest(
                itauResponse.getIspbDaIntituicao(),
                itauResponse.agencia,
                itauResponse.numero,
                TipoDeContaBcbEnum.getTipoDeConta(itauResponse.tipo)
            )
        }
    }
}

