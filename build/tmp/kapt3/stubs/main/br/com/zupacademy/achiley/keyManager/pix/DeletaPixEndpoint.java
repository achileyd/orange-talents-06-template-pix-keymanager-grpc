package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/DeletaPixEndpoint;", "Lbr/com/zupacademy/achiley/KeyManagerDeleteServiceGrpc$KeyManagerDeleteServiceImplBase;", "repository", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "(Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getRepository", "()Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "deletar", "", "request", "Lbr/com/zupacademy/achiley/DeletaPixRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lcom/google/protobuf/Empty;", "keyManagerGrpc"})
@br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler()
@jakarta.inject.Singleton()
public class DeletaPixEndpoint extends br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceImplBase {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository = null;
    private final org.slf4j.Logger log = null;
    
    public DeletaPixEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void deletar(@org.jetbrains.annotations.Nullable()
    br.com.zupacademy.achiley.DeletaPixRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
    }
}