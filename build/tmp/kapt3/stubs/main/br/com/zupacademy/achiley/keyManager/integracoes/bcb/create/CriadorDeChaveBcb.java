package br.com.zupacademy.achiley.keyManager.integracoes.bcb.create;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/create/CriadorDeChaveBcb;", "", "bcbClient", "Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/BcbClient;", "(Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/BcbClient;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "criaChave", "Lbr/com/zupacademy/achiley/keyManager/integracoes/BcbClientCriaChaveResponse;", "request", "Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/BcbClientCriaChaveRequest;", "keyManagerGrpc"})
@jakarta.inject.Singleton()
public final class CriadorDeChaveBcb {
    @jakarta.inject.Inject()
    private final br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClient bcbClient = null;
    private final org.slf4j.Logger log = null;
    
    public CriadorDeChaveBcb(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClient bcbClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.BcbClientCriaChaveResponse criaChave(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.bcb.BcbClientCriaChaveRequest request) {
        return null;
    }
}