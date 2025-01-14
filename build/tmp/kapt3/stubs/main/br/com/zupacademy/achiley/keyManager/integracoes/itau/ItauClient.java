package br.com.zupacademy.achiley.keyManager.integracoes.itau;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClient;", "", "buscaClientePeloId", "Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClientDadosDoClienteResponse;", "clienteId", "", "corroborarDados", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauClientCorroboracaoResponse;", "tipoDeConta", "Lbr/com/zupacademy/achiley/TipoDeContaEnum;", "keyManagerGrpc"})
@io.micronaut.http.client.annotation.Client(value = "${itau.client.url}/clientes")
public abstract interface ItauClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{clienteId}/contas")
    public abstract io.micronaut.http.HttpResponse<br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse> corroborarDados(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "clienteId")
    java.lang.String clienteId, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue(value = "tipo")
    br.com.zupacademy.achiley.TipoDeContaEnum tipoDeConta);
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{clienteId}")
    public abstract br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClientDadosDoClienteResponse buscaClientePeloId(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "clienteId")
    java.lang.String clienteId);
}