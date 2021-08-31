package br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete

import javax.xml.bind.annotation.XmlElement

class BcbClientDeletaChaveRequest(
    val key: String,
    val participant: String
) {
}