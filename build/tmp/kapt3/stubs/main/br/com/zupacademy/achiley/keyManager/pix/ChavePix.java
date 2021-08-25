package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/ChavePix;", "", "tipoDeChave", "Lbr/com/zupacademy/achiley/TipoDeChaveEnum;", "chave", "", "clienteId", "tipoDeConta", "Lbr/com/zupacademy/achiley/TipoDeContaEnum;", "(Lbr/com/zupacademy/achiley/TipoDeChaveEnum;Ljava/lang/String;Ljava/lang/String;Lbr/com/zupacademy/achiley/TipoDeContaEnum;)V", "getChave", "()Ljava/lang/String;", "getClienteId", "criadoEm", "Ljava/time/LocalDateTime;", "getCriadoEm", "()Ljava/time/LocalDateTime;", "pixId", "getPixId", "setPixId", "(Ljava/lang/String;)V", "getTipoDeChave", "()Lbr/com/zupacademy/achiley/TipoDeChaveEnum;", "getTipoDeConta", "()Lbr/com/zupacademy/achiley/TipoDeContaEnum;", "keyManagerGrpc"})
@javax.persistence.Entity()
public final class ChavePix {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(nullable = false)
    private final br.com.zupacademy.achiley.TipoDeChaveEnum tipoDeChave = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 77)
    @javax.persistence.Column(nullable = false, unique = true)
    private final java.lang.String chave = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String clienteId = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zupacademy.achiley.TipoDeContaEnum tipoDeConta = null;
    @org.jetbrains.annotations.Nullable()
    @org.hibernate.annotations.GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @javax.persistence.GeneratedValue(generator = "UUID")
    @javax.persistence.Id()
    private java.lang.String pixId;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime criadoEm = null;
    
    public ChavePix(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeChaveEnum tipoDeChave, @org.jetbrains.annotations.NotNull()
    java.lang.String chave, @org.jetbrains.annotations.NotNull()
    java.lang.String clienteId, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeContaEnum tipoDeConta) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.TipoDeChaveEnum getTipoDeChave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClienteId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.TipoDeContaEnum getTipoDeConta() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPixId() {
        return null;
    }
    
    public final void setPixId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCriadoEm() {
        return null;
    }
}