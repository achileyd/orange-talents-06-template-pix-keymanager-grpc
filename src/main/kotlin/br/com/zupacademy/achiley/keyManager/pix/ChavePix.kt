package br.com.zupacademy.achiley.keyManager.pix

import br.com.zupacademy.achiley.TipoDeChaveEnum
import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity
class ChavePix(
    @field:NotBlank
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val tipoDeChave: TipoDeChaveEnum,
    @field:Size(max=77)
    @Column(nullable = false, unique = true)
    val chave: String,
    @field:NotBlank
    val clienteId: String,
    @field:NotBlank
    @Enumerated(EnumType.STRING)
    val tipoDeConta: br.com.zupacademy.achiley.TipoDeContaEnum
) {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    var pixId: String? = null
    val criadoEm: LocalDateTime = LocalDateTime.now()

    fun pertenceAoClienteId(id: String): Boolean = this.clienteId == id
}

