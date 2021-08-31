package br.com.zupacademy.achiley.keyManager.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0007H\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0007J\b\u0010\u0018\u001a\u00020\u0010H\u0007J\b\u0010\u0019\u001a\u00020\u0010H\u0007J\b\u0010\u001a\u001a\u00020\u0010H\u0007J\b\u0010\u001b\u001a\u00020\u0010H\u0007J\b\u0010\u001c\u001a\u00020\u0010H\u0007J\b\u0010\u001d\u001a\u00020\u0010H\u0007J\b\u0010\u001e\u001a\u00020\u0010H\u0007J\b\u0010\u001f\u001a\u00020\u0010H\u0007J\b\u0010 \u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/CadastroPixEndpointTest;", "", "grpcClient", "Lbr/com/zupacademy/achiley/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;", "repository", "Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "itauClient", "Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClient;", "(Lbr/com/zupacademy/achiley/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClient;)V", "getGrpcClient", "()Lbr/com/zupacademy/achiley/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;", "getItauClient", "()Lbr/com/zupacademy/achiley/keyManager/integracoes/itau/ItauClient;", "getRepository", "()Lbr/com/zupacademy/achiley/keyManager/pix/ChavePixRepository;", "deve cadastrar uma nova chave pix com tipo de chave email", "", "deve cadastrar uma nova chave pix com tipo de chave random", "itauClientMock", "mockItauClientResponse", "Lbr/com/zupacademy/achiley/keyManager/integracoes/ItauClientCorroboracaoResponse;", "pixRequest", "Lbr/com/zupacademy/achiley/CadastroPixRequest;", "nao deve cadastrar uma chave pix com formato de celular invalido", "nao deve cadastrar uma chave pix com formato de cpf invalido", "nao deve cadastrar uma chave pix com formato de email invalido", "nao deve cadastrar uma chave pix com tipo de chave random e campo chave preenchido", "nao deve cadastrar uma chave pix com tipo de chave unrecognized key", "nao deve cadastrar uma chave pix com tipo de conta unregonized account", "nao deve cadastrar uma chave pix duplicada", "nao deve cadastrar uma chave pix quando o itau client retorna um erro", "nao deve cadastrar uma chave pix quando o itau nao encontra os dados", "setUp", "Clients", "keyManagerGrpc"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(transactional = false)
public final class CadastroPixEndpointTest {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub grpcClient = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient itauClient = null;
    
    public CadastroPixEndpointTest(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub grpcClient, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient itauClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub getGrpcClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.pix.ChavePixRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient getItauClient() {
        return null;
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setUp() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zupacademy.achiley.keyManager.integracoes.ItauClientCorroboracaoResponse mockItauClientResponse(@org.jetbrains.annotations.NotNull()
    br.com.zupacademy.achiley.CadastroPixRequest pixRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.test.annotation.MockBean(value = br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient.class)
    public final br.com.zupacademy.achiley.keyManager.integracoes.itau.ItauClient itauClientMock() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/pix/CadastroPixEndpointTest$Clients;", "", "()V", "blockingStub", "Lbr/com/zupacademy/achiley/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceBlockingStub;", "channel", "Lio/grpc/ManagedChannel;", "keyManagerGrpc"})
    @io.micronaut.context.annotation.Factory()
    public static final class Clients {
        
        public Clients() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @jakarta.inject.Singleton()
        public final br.com.zupacademy.achiley.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceBlockingStub blockingStub(@org.jetbrains.annotations.NotNull()
        @io.micronaut.grpc.annotation.GrpcChannel(value = "grpc-server")
        io.grpc.ManagedChannel channel) {
            return null;
        }
    }
}