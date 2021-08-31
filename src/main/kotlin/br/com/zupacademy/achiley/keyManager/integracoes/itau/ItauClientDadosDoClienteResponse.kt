package br.com.zupacademy.achiley.keyManager.integracoes.itau

import br.com.zupacademy.achiley.keyManager.integracoes.ItauInstituicaoResponse

class ItauClientDadosDoClienteResponse(
    val id: String,
    val nome: String,
    val cpf: String,
    val instituicao: ItauInstituicaoResponse
) {
    fun getIspb(): String{
        return instituicao.ispb
    }
}
