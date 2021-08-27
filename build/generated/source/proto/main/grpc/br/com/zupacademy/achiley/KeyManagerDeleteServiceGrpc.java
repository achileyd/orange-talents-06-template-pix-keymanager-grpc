package br.com.zupacademy.achiley;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: keyManagerGrpc.proto")
public final class KeyManagerDeleteServiceGrpc {

  private KeyManagerDeleteServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zupacademy.achiley.KeyManagerDeleteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zupacademy.achiley.DeletaPixRequest,
      com.google.protobuf.Empty> getDeletarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletar",
      requestType = br.com.zupacademy.achiley.DeletaPixRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zupacademy.achiley.DeletaPixRequest,
      com.google.protobuf.Empty> getDeletarMethod() {
    io.grpc.MethodDescriptor<br.com.zupacademy.achiley.DeletaPixRequest, com.google.protobuf.Empty> getDeletarMethod;
    if ((getDeletarMethod = KeyManagerDeleteServiceGrpc.getDeletarMethod) == null) {
      synchronized (KeyManagerDeleteServiceGrpc.class) {
        if ((getDeletarMethod = KeyManagerDeleteServiceGrpc.getDeletarMethod) == null) {
          KeyManagerDeleteServiceGrpc.getDeletarMethod = getDeletarMethod =
              io.grpc.MethodDescriptor.<br.com.zupacademy.achiley.DeletaPixRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zupacademy.achiley.DeletaPixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerDeleteServiceMethodDescriptorSupplier("deletar"))
              .build();
        }
      }
    }
    return getDeletarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerDeleteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerDeleteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerDeleteServiceStub>() {
        @java.lang.Override
        public KeyManagerDeleteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerDeleteServiceStub(channel, callOptions);
        }
      };
    return KeyManagerDeleteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerDeleteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerDeleteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerDeleteServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagerDeleteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerDeleteServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerDeleteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerDeleteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerDeleteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerDeleteServiceFutureStub>() {
        @java.lang.Override
        public KeyManagerDeleteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerDeleteServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagerDeleteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerDeleteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deletar(br.com.zupacademy.achiley.DeletaPixRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeletarMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.zupacademy.achiley.DeletaPixRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETAR)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerDeleteServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerDeleteServiceStub> {
    private KeyManagerDeleteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerDeleteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerDeleteServiceStub(channel, callOptions);
    }

    /**
     */
    public void deletar(br.com.zupacademy.achiley.DeletaPixRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerDeleteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerDeleteServiceBlockingStub> {
    private KeyManagerDeleteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerDeleteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerDeleteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty deletar(br.com.zupacademy.achiley.DeletaPixRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerDeleteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerDeleteServiceFutureStub> {
    private KeyManagerDeleteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerDeleteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerDeleteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletar(
        br.com.zupacademy.achiley.DeletaPixRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerDeleteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerDeleteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETAR:
          serviceImpl.deletar((br.com.zupacademy.achiley.DeletaPixRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class KeyManagerDeleteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerDeleteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zupacademy.achiley.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerDeleteService");
    }
  }

  private static final class KeyManagerDeleteServiceFileDescriptorSupplier
      extends KeyManagerDeleteServiceBaseDescriptorSupplier {
    KeyManagerDeleteServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagerDeleteServiceMethodDescriptorSupplier
      extends KeyManagerDeleteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerDeleteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerDeleteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerDeleteServiceFileDescriptorSupplier())
              .addMethod(getDeletarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
