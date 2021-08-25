package br.com.zupacademy.achiley.keyManager.integracoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u0007J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006&"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauClientCorroboracaoResponse;", "", "tipo", "Lbr/com/zupacademy/achiley/TipoDeContaEnum;", "instituicao", "Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauInstituicaoResponse;", "agencia", "", "numero", "titular", "Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauTitularResponse;", "(Lbr/com/zupacademy/achiley/TipoDeContaEnum;Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauInstituicaoResponse;Ljava/lang/String;Ljava/lang/String;Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauTitularResponse;)V", "getAgencia", "()Ljava/lang/String;", "getInstituicao", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauInstituicaoResponse;", "getNumero", "getTipo", "()Lbr/com/zupacademy/achiley/TipoDeContaEnum;", "getTitular", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauTitularResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getCpfDoTitular", "getIdDoTitular", "getIspbDaIntituicao", "getNomeDaInstituicao", "getNomeDoTitular", "hashCode", "", "toString", "keyManagerGrpc"})
public final class ItauClientCorroboracaoResponse {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.TipoDeContaEnum tipo = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.integracoes.ItauInstituicaoResponse instituicao = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String agencia = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String numero = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.integracoes.ItauTitularResponse titular = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse copy(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeContaEnum tipo, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.ItauInstituicaoResponse instituicao, @org.jetbrains.annotations.NotNull()
    java.lang.String agencia, @org.jetbrains.annotations.NotNull()
    java.lang.String numero, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.ItauTitularResponse titular) {
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
    
    public ItauClientCorroboracaoResponse(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeContaEnum tipo, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.ItauInstituicaoResponse instituicao, @org.jetbrains.annotations.NotNull()
    java.lang.String agencia, @org.jetbrains.annotations.NotNull()
    java.lang.String numero, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.ItauTitularResponse titular) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.TipoDeContaEnum component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.TipoDeContaEnum getTipo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.ItauInstituicaoResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.ItauInstituicaoResponse getInstituicao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAgencia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumero() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.ItauTitularResponse component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.ItauTitularResponse getTitular() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNomeDaInstituicao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIspbDaIntituicao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdDoTitular() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCpfDoTitular() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNomeDoTitular() {
        return null;
    }
}