package br.com.zupacademy.achiley.keyManager.integracoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/integracoes/CorroboradorDeDadosItau;", "", "itauClient", "Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauClient;", "(Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauClient;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "corroboraDados", "", "clienteId", "", "tipoDeConta", "Lbr/com/zupacademy/achiley/TipoDeContaEnum;", "keyManagerGrpc"})
@jakarta.inject.Singleton()
public final class CorroboradorDeDadosItau {
    @jakarta.inject.Inject()
    private final br.com.zupacademy.achiley.keyManager.integracoes.ItauClient itauClient = null;
    private final org.slf4j.Logger log = null;
    
    public CorroboradorDeDadosItau(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.ItauClient itauClient) {
        super();
    }
    
    public final void corroboraDados(@org.jetbrains.annotations.NotNull()
    java.lang.String clienteId, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.TipoDeContaEnum tipoDeConta) {
    }
}