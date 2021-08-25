package br.com.zupacademy.achiley.keyManager.shared.exceptions.handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u0004\u0018\u00010\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lbr/com/zupacademy/achiley/keyManager/shared/exceptions/handler/ExceptionHandlerInterceptor;", "Lio/micronaut/aop/MethodInterceptor;", "Lio/grpc/BindableService;", "", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "handleConstraintViolationException", "Lio/grpc/StatusRuntimeException;", "e", "Ljavax/validation/ConstraintViolationException;", "intercept", "context", "Lio/micronaut/aop/MethodInvocationContext;", "keyManagerGrpc"})
@io.micronaut.aop.InterceptorBean(value = {br.com.zupacademy.achiley.keyManager.shared.exceptions.handler.ErrorHandler.class})
@jakarta.inject.Singleton()
public final class ExceptionHandlerInterceptor implements io.micronaut.aop.MethodInterceptor<io.grpc.BindableService, java.lang.Object> {
    private final org.slf4j.Logger log = null;
    
    public ExceptionHandlerInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object intercept(@org.jetbrains.annotations.NotNull()
    io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> context) {
        return null;
    }
    
    private final io.grpc.StatusRuntimeException handleConstraintViolationException(javax.validation.ConstraintViolationException e) {
        return null;
    }
}