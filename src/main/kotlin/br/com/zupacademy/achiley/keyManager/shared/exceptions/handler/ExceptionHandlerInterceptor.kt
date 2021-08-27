package br.com.zupacademy.achiley.keyManager.shared.exceptions.handler

import br.com.zupacademy.achiley.keyManager.shared.exceptions.AlreadyExistsException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.ClientErrorException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.ForbiddenException
import br.com.zupacademy.achiley.keyManager.shared.exceptions.NotFoundException
import com.google.rpc.BadRequest
import io.grpc.BindableService
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.grpc.protobuf.StatusProto
import io.grpc.stub.StreamObserver
import io.micronaut.aop.InterceptorBean
import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.http.exceptions.HttpStatusException
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
import javax.validation.ConstraintViolationException

@Singleton
@InterceptorBean(ErrorHandler::class)
class ExceptionHandlerInterceptor: MethodInterceptor<BindableService, Any?> {
    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun intercept(context: MethodInvocationContext<BindableService, Any?>): Any? {
        log.info("Interceptando o metodo: ${context.targetMethod}")
        try {
            return context.proceed() // invocar o metodo intereptado: cadastra(request, response)
        } catch (e: Exception) {

            e.printStackTrace()

            val statusError = when(e) {
                is IllegalArgumentException -> Status.INVALID_ARGUMENT.withDescription(e.message).asRuntimeException()
                is IllegalStateException -> Status.FAILED_PRECONDITION.withDescription(e.message).asRuntimeException()
                is AlreadyExistsException -> Status.ALREADY_EXISTS.withDescription(e.message).asRuntimeException()
                is ConstraintViolationException -> handleConstraintViolationException(e)
                is NotFoundException -> Status.NOT_FOUND.withDescription(e.message).asRuntimeException()
                is ClientErrorException -> Status.UNAVAILABLE.withDescription(e.message).asRuntimeException()
                is ForbiddenException -> Status.PERMISSION_DENIED.withDescription(e.message).asRuntimeException()
                else -> Status.UNKNOWN.withDescription("Erro inesperado").asRuntimeException()
            }

            val responseObserver = context.parameterValues[1] as StreamObserver<*>
            responseObserver.onError(statusError)
            return null
        }
    }

    private fun handleConstraintViolationException(
        e: ConstraintViolationException
    ): StatusRuntimeException {
        e.printStackTrace()

        val violations = e.constraintViolations.map {
            BadRequest.FieldViolation.newBuilder()
                .setField(it.propertyPath.last().name) // documento: must not be blank
                .setDescription(it.message)
                .build()
        }

        val details = BadRequest.newBuilder()
            .addAllFieldViolations(violations)
            .build()

        val statusProto = com.google.rpc.Status.newBuilder()
            .setCode(Status.INVALID_ARGUMENT.code.value())
            .setMessage("parametros de entrada invalidos")
            .addDetails(com.google.protobuf.Any.pack(details)) // array de bytes
            .build()

        log.error("statusProto = $statusProto")

        return StatusProto.toStatusRuntimeException(statusProto)
    }
}