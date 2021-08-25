package br.com.zupacademy.achiley.keyManager.integracoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauClient;", "", "()V", "corroborarDados", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauClientCorroboracaoResponse;", "clientId", "", "tipoDeConta", "Lbr/com/zupacademy/achiley/TipoDeContaEnum;", "keyManagerGrpc"})
@io.micronaut.http.client.annotation.Client(value = "${itau.client.url}/clientes")
public abstract class ItauClient {
    
    public ItauClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{clienteId}/contas")
    public abstract io.micronaut.http.HttpResponse<br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse> corroborarDados(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "clienteId")
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue(value = "tipo")
    br.com.zupacademy.achiley.TipoDeContaEnum tipoDeConta);
}