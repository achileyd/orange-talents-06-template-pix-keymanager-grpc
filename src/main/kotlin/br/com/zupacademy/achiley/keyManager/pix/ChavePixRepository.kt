package br.com.zupacademy.achiley.keyManager.pix

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface ChavePixRepository : JpaRepository<ChavePix, String> {
    fun existsByChave(chave: String): Boolean
    fun existsByClienteId(clienteId: String): Boolean
}