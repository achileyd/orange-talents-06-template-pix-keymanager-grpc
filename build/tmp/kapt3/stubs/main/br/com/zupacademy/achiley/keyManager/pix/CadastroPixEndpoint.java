package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\"\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/CadastroPixEndpoint;", "Lbr/com/zupacademy/achiley/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceImplBase;", "repository", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "corroborador", "Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/CorroboradorDeDadosItau;", "criadorDeChave", "Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/create/CriadorDeChaveBcb;", "validador", "Lbr/com/zupacademy/achiley/keyManager/shared/validators/ValidadorDePix;", "(Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/CorroboradorDeDadosItau;Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/create/CriadorDeChaveBcb;Lbr/com/zupacademy/achiley/keyManager/shared/validators/ValidadorDePix;)V", "getCorroborador", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/CorroboradorDeDadosItau;", "getCriadorDeChave", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/create/CriadorDeChaveBcb;", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getRepository", "()Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "getValidador", "()Lbr/com/zupacademy/achiley/keyManager/shared/validators/ValidadorDePix;", "cadastrar", "", "request", "Lbr/com/zupacademy/achiley/CadastroPixRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zupacademy/achiley/CadastroPixResponse;", "keyManagerGrpc"})
@br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler()
@jakarta.inject.Singleton()
public class CadastroPixEndpoint extends br.com.zupacademy.achiley.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    @jakarta.inject.Inject()
    private final br.com.zupacademy.achiley.keyManager.integracoes.itau.CorroboradorDeDadosItau corroborador = null;
    @org.jetbrains.annotations.NotNull()
    @jakarta.inject.Inject()
    private final br.com.zupacademy.achiley.keyManager.integracoes.bcb.create.CriadorDeChaveBcb criadorDeChave = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.shared.validators.ValidadorDePix validador = null;
    private final org.slf4j.Logger log = null;
    
    public CadastroPixEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.itau.CorroboradorDeDadosItau corroborador, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.bcb.create.CriadorDeChaveBcb criadorDeChave, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.shared.validators.ValidadorDePix validador) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.integracoes.itau.CorroboradorDeDadosItau getCorroborador() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.integracoes.bcb.create.CriadorDeChaveBcb getCriadorDeChave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.shared.validators.ValidadorDePix getValidador() {
        return null;
    }
    
    @java.lang.Override()
    public void cadastrar(@org.jetbrains.annotations.Nullable()
    br.com.zupacademy.achiley.CadastroPixRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<br.com.zupacademy.achiley.CadastroPixResponse> responseObserver) {
    }
}