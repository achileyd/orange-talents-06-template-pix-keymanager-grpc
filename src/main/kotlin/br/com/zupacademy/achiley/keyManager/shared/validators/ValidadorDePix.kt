package br.com.zupacademy.achiley.keyManager.shared.validators

import br.com.zupacademy.achiley.TipoDeChaveEnum
import br.com.zupacademy.achiley.TipoDeChaveEnum.*
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
import java.lang.IllegalArgumentException

@Singleton
class ValidadorDePix {

    private val log = LoggerFactory.getLogger(ValidadorDePix::class.java)

    fun valida(tipoDeChave: TipoDeChaveEnum, chave: String) {
        log.info("Iniciando validacao. Tipo de chave: $tipoDeChave")

        when (tipoDeChave) {
            UNRECOGNIZED_KEY -> throw IllegalArgumentException("Tipo de chave invalido")
            CPF -> validaCpf(chave)
            CELULAR -> validaCelular(chave)
            EMAIL -> validaEmail(chave)
            RANDOM -> validaRandom(chave)
        }
    }

    fun validaCpf(chave: String) {
        val possivelChave = chave.matches("^[0-9]{11}\$".toRegex())
        if (possivelChave == false) {
            throw IllegalArgumentException("O cpf indicado não é válido!")
        }
    }

    fun validaCelular(chave: String) {
        val possivelChave = chave.matches("^\\+[1-9][0-9]\\d{1,14}\$".toRegex())
        if (possivelChave == false) {
            throw IllegalArgumentException("O celular indicado não é válido!")
        }
    }

    fun validaEmail(chave: String) {
        val possivelChave = chave.matches(("[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+").toRegex())
        if (possivelChave == false) {
            throw IllegalArgumentException("O email indicado não é válido!")
        }
    }

    fun validaRandom(chave: String) {
        if (chave.isNotBlank().or(chave.contains(" "))) throw IllegalArgumentException(
            "Para utilizar a opção chave aleatória " +
                    "o valor da chave não deve ser preenchido "
        )
    }
}

