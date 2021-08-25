package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/CadastroPixEndpoint;", "Lbr/com/zupacademy/achiley/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceImplBase;", "repository", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "corroborador", "Lbr/com/zupacademy/achiley/keyManager/integracoes/CorroboradorDeDadosItau;", "validador", "Lbr/com/zupacademy/achiley/keyManager/shared/validators/ValidadorDePix;", "(Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;Lbr/com/zupacademy/achiley/keyManager/integracoes/CorroboradorDeDadosItau;Lbr/com/zupacademy/achiley/keyManager/shared/validators/ValidadorDePix;)V", "getCorroborador", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/CorroboradorDeDadosItau;", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getRepository", "()Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "getValidador", "()Lbr/com/zupacademy/achiley/keyManager/shared/validators/ValidadorDePix;", "cadastrar", "", "request", "Lbr/com/zupacademy/achiley/CadastroPixRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zupacademy/achiley/CadastroPixResponse;", "keyManagerGrpc"})
@br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler()
@jakarta.inject.Singleton()
public class CadastroPixEndpoint extends br.com.zupacademy.achiley.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    @jakarta.inject.Inject()
    private final br.com.zupacademy.achiley.keyManager.integracoes.CorroboradorDeDadosItau corroborador = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.shared.validators.ValidadorDePix validador = null;
    private final org.slf4j.Logger log = null;
    
    public CadastroPixEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.CorroboradorDeDadosItau corroborador, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.shared.validators.ValidadorDePix validador) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.integracoes.CorroboradorDeDadosItau getCorroborador() {
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