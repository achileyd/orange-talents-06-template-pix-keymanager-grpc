package br.com.zupacademy.achiley;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: keyManagerGrpc.proto")
public final class KeyManagerGrpcServiceGrpc {

  private KeyManagerGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zupacademy.achiley.KeyManagerGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zupacademy.achiley.CadastroPixRequest,
      br.com.zupacademy.achiley.CadastroPixResponse> getCadastrarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cadastrar",
      requestType = br.com.zupacademy.achiley.CadastroPixRequest.class,
      responseType = br.com.zupacademy.achiley.CadastroPixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zupacademy.achiley.CadastroPixRequest,
      br.com.zupacademy.achiley.CadastroPixResponse> getCadastrarMethod() {
    io.grpc.MethodDescriptor<br.com.zupacademy.achiley.CadastroPixRequest, br.com.zupacademy.achiley.CadastroPixResponse> getCadastrarMethod;
    if ((getCadastrarMethod = KeyManagerGrpcServiceGrpc.getCadastrarMethod) == null) {
      synchronized (KeyManagerGrpcServiceGrpc.class) {
        if ((getCadastrarMethod = KeyManagerGrpcServiceGrpc.getCadastrarMethod) == null) {
          KeyManagerGrpcServiceGrpc.getCadastrarMethod = getCadastrarMethod =
              io.grpc.MethodDescriptor.<br.com.zupacademy.achiley.CadastroPixRequest, br.com.zupacademy.achiley.CadastroPixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cadastrar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zupacademy.achiley.CadastroPixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zupacademy.achiley.CadastroPixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerGrpcServiceMethodDescriptorSupplier("cadastrar"))
              .build();
        }
      }
    }
    return getCadastrarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceStub>() {
        @java.lang.Override
        public KeyManagerGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerGrpcServiceStub(channel, callOptions);
        }
      };
    return KeyManagerGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void cadastrar(br.com.zupacademy.achiley.CadastroPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zupacademy.achiley.CadastroPixResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCadastrarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCadastrarMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.zupacademy.achiley.CadastroPixRequest,
                br.com.zupacademy.achiley.CadastroPixResponse>(
                  this, METHODID_CADASTRAR)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerGrpcServiceStub> {
    private KeyManagerGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void cadastrar(br.com.zupacademy.achiley.CadastroPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zupacademy.achiley.CadastroPixResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCadastrarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerGrpcServiceBlockingStub> {
    private KeyManagerGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zupacademy.achiley.CadastroPixResponse cadastrar(br.com.zupacademy.achiley.CadastroPixRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCadastrarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerGrpcServiceFutureStub> {
    private KeyManagerGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zupacademy.achiley.CadastroPixResponse> cadastrar(
        br.com.zupacademy.achiley.CadastroPixRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCadastrarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CADASTRAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CADASTRAR:
          serviceImpl.cadastrar((br.com.zupacademy.achiley.CadastroPixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zupacademy.achiley.CadastroPixResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeyManagerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zupacademy.achiley.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerGrpcService");
    }
  }

  private static final class KeyManagerGrpcServiceFileDescriptorSupplier
      extends KeyManagerGrpcServiceBaseDescriptorSupplier {
    KeyManagerGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerGrpcServiceMethodDescriptorSupplier
      extends KeyManagerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KeyManagerGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerGrpcServiceFileDescriptorSupplier())
              .addMethod(getCadastrarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
