package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/DeletaPixEndpoint;", "Lbr/com/zupacademy/achiley/KeyManagerDeleteServiceGrpc$KeyManagerDeleteServiceImplBase;", "repository", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "deletadorDeChave", "Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/delete/DeletadorDeChaveBcb;", "itauClient", "Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClient;", "(Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/delete/DeletadorDeChaveBcb;Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClient;)V", "getDeletadorDeChave", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/bcb/delete/DeletadorDeChaveBcb;", "getItauClient", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClient;", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getRepository", "()Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "deletar", "", "request", "Lbr/com/zupacademy/achiley/DeletaPixRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lcom/google/protobuf/Empty;", "keyManagerGrpc"})
@br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler()
@jakarta.inject.Singleton()
public class DeletaPixEndpoint extends br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceImplBase {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.DeletadorDeChaveBcb deletadorDeChave = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient itauClient = null;
    private final org.slf4j.Logger log = null;
    
    public DeletaPixEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.DeletadorDeChaveBcb deletadorDeChave, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient itauClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.integracoes.bcb.delete.DeletadorDeChaveBcb getDeletadorDeChave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient getItauClient() {
        return null;
    }
    
    @java.lang.Override()
    public void deletar(@org.jetbrains.annotations.Nullable()
    br.com.zupacademy.achiley.DeletaPixRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
    }
}