package br.com.zupacademy.achiley.keyManager.shared.validators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/shared/validators/ValidadorDePix;", "", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "valida", "", "tipoDeChave", "Lbr/com/zupacademy/achiley/TipoDeChaveEnum;", "chave", "", "validaCelular", "validaCpf", "validaEmail", "validaRandom", "keyManagerGrpc"})
@jakarta.inject.Singleton()
public final class ValidadorDePix {
    private final org.slf4j.Logger log = null;
    
    public ValidadorDePix() {
        super();
    }
    
    public final void valida(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeChaveEnum tipoDeChave, @org.jetbrains.annotations.NotNull()
    java.lang.String chave) {
    }
    
    public final void validaCpf(@org.jetbrains.annotations.NotNull()
    java.lang.String chave) {
    }
    
    public final void validaCelular(@org.jetbrains.annotations.NotNull()
    java.lang.String chave) {
    }
    
    public final void validaEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String chave) {
    }
    
    public final void validaRandom(@org.jetbrains.annotations.NotNull()
    java.lang.String chave) {
    }
}