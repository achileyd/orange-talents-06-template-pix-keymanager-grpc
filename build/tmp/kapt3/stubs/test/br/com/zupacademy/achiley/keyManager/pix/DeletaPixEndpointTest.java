package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0007J\b\u0010\u0017\u001a\u00020\u0015H\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0007J\b\u0010\u0019\u001a\u00020\u0015H\u0007J\b\u0010\u001a\u001a\u00020\u0015H\u0007R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/DeletaPixEndpointTest;", "", "grpcClient", "Lbr/com/zupacademy/achiley/KeyManagerDeleteServiceGrpc$KeyManagerDeleteServiceBlockingStub;", "repository", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "(Lbr/com/zupacademy/achiley/KeyManagerDeleteServiceGrpc$KeyManagerDeleteServiceBlockingStub;Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;)V", "chaveDeOutroDono", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePix;", "getChaveDeOutroDono", "()Lbr/com/zupacademy/achiley/keyManager/pix/ChavePix;", "setChaveDeOutroDono", "(Lbr/com/zupacademy/achiley/keyManager/pix/ChavePix;)V", "chaveExistente", "getChaveExistente", "setChaveExistente", "getGrpcClient", "()Lbr/com/zupacademy/achiley/KeyManagerDeleteServiceGrpc$KeyManagerDeleteServiceBlockingStub;", "getRepository", "()Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "deve deletar uma chave pix", "", "nao deve deletar uma chave pix quando cliente id nao for encontrado", "nao deve deletar uma chave pix quando o cliente id nao for o dono daquela pix id", "nao deve deletar uma chave pix quando o pix id nao for encontrado", "setUp", "tearDown", "GrpcForDeleteTest", "keyManagerGrpc"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(transactional = false)
public final class DeletaPixEndpointTest {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceBlockingStub grpcClient = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository = null;
    public br.com.zupacademy.achiley.keyManager.pix.ChavePix chaveExistente;
    public br.com.zupacademy.achiley.keyManager.pix.ChavePix chaveDeOutroDono;
    
    public DeletaPixEndpointTest(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceBlockingStub grpcClient, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceBlockingStub getGrpcClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.pix.ChavePix getChaveExistente() {
        return null;
    }
    
    public final void setChaveExistente(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePix p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.pix.ChavePix getChaveDeOutroDono() {
        return null;
    }
    
    public final void setChaveDeOutroDono(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePix p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setUp() {
    }
    
    @org.junit.jupiter.api.AfterEach()
    public final void tearDown() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/DeletaPixEndpointTest$GrpcForDeleteTest;", "", "()V", "blockingStub", "Lbr/com/zupacademy/achiley/KeyManagerDeleteServiceGrpc$KeyManagerDeleteServiceBlockingStub;", "channel", "Lio/grpc/ManagedChannel;", "keyManagerGrpc"})
    @io.micronaut.context.annotation.Factory()
    public static final class GrpcForDeleteTest {
        
        public GrpcForDeleteTest() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @jakarta.inject.Singleton()
        public final br.com.zupacademy.achiley.KeyManagerDeleteServiceGrpc.KeyManagerDeleteServiceBlockingStub blockingStub(@org.jetbrains.annotations.NotNull()
        @io.micronaut.grpc.annotation.GrpcChannel(value = "grpc-server")
        io.grpc.ManagedChannel channel) {
            return null;
        }
    }
}