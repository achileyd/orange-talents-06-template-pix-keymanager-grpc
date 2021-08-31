package br.com.zupacademy.achiley.keyManager.integracoes.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/BcbClient;", "", "criaChave", "Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbClientCriaChaveResponse;", "request", "Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/BcbClientCriaChaveRequest;", "deletaChave", "Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/delete/BcbClientDeletaChaveResponse;", "chave", "", "bcbRequest", "Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/delete/BcbClientDeletaChaveRequest;", "keyManagerGrpc"})
@io.micronaut.http.client.annotation.Client(value = "${bcb.client.url}/pix/keys")
public abstract interface BcbClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(produces = {"application/xml"})
    public abstract br.com.zupacademy.achiley.keyManager.integracoes.BcbClientCriaChaveResponse criaChave(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClientCriaChaveRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/{chave}", produces = {"application/xml"})
    public abstract br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.BcbClientDeletaChaveResponse deletaChave(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "chave")
    java.lang.String chave, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.BcbClientDeletaChaveRequest bcbRequest);
}