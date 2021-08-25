package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePix;", "", "existsByChave", "", "chave", "keyManagerGrpc"})
@io.micronaut.data.annotation.Repository()
public abstract interface ChavePixRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.zupacademy.achiley.keyManager.pix.ChavePix, java.lang.String> {
    
    public abstract boolean existsByChave(@org.jetbrains.annotations.NotNull()
    java.lang.String chave);
}