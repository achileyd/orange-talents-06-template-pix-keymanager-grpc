package br.com.zupacademy.achiley.keyManager.integracoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbClientCriaChaveResponse;", "", "keyType", "Lbr/com/zupacademy/achiley/TipoDeChaveEnum;", "key", "", "bankAccount", "Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbBancoEContaResponse;", "owner", "Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbTitularResponse;", "createdAt", "Ljava/time/LocalDateTime;", "(Lbr/com/zupacademy/achiley/TipoDeChaveEnum;Ljava/lang/String;Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbBancoEContaResponse;Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbTitularResponse;Ljava/time/LocalDateTime;)V", "getBankAccount", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbBancoEContaResponse;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getKey", "()Ljava/lang/String;", "getKeyType", "()Lbr/com/zupacademy/achiley/TipoDeChaveEnum;", "getOwner", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbTitularResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "keyManagerGrpc"})
public final class BcbClientCriaChaveResponse {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.TipoDeChaveEnum keyType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.integracoes.BcbBancoEContaResponse bankAccount = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.integracoes.BcbTitularResponse owner = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime createdAt = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.BcbClientCriaChaveResponse copy(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeChaveEnum keyType, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.BcbBancoEContaResponse bankAccount, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.BcbTitularResponse owner, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime createdAt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BcbClientCriaChaveResponse(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeChaveEnum keyType, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.BcbBancoEContaResponse bankAccount, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.BcbTitularResponse owner, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime createdAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.TipoDeChaveEnum component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.TipoDeChaveEnum getKeyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.BcbBancoEContaResponse component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.BcbBancoEContaResponse getBankAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.BcbTitularResponse component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.BcbTitularResponse getOwner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
}