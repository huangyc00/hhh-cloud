package com.hyc.common.handler;

import com.hyc.common.exception.BaseException;
import com.netflix.hystrix.exception.HystrixRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 统一异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 校验异常处理
     *
     * @param e e
     * @return AjaxResult
     * @throws Exception
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<String> bindExceptionHandler(HttpServletRequest request, MethodArgumentNotValidException e) {
        BindingResult bindResult = e.getBindingResult();
        List<FieldError> errors = bindResult.getFieldErrors();
        StringBuffer errorMsg = new StringBuffer();
        if (errors.size() > 0) {
            for (FieldError f : errors) {
                errorMsg.append(f.getDefaultMessage() + ",");
            }
            errorMsg.delete(errorMsg.length() - 1, errorMsg.length());
        }
        log.info("参数校验异常,uri:{},原因:{}", request.getRequestURI(), errorMsg.toString());
        return new ResponseEntity<>(errorMsg.toString(), HttpStatus.BAD_REQUEST);
    }

    /**
     * 用户中心异常handler
     *
     * @param request request
     * @param e       e
     * @return AjaxResult
     * @throws Exception
     */
    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public ResponseEntity<String> baseExceptionHandler(HttpServletRequest request, BaseException e) throws Exception {
        log.info("baseException exception,requestUri:{},\n{}", request.getRequestURI(), e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Hystrix运行时异常handler
     *
     * @param request request
     * @param e       e
     * @return AjaxResult
     * @throws Exception
     */
    @ExceptionHandler(value = HystrixRuntimeException.class)
    public ResponseEntity<String> hystrixRuntimeExceptionHandler(HttpServletRequest request, HttpServletResponse response, HystrixRuntimeException e) {
        String errorMsg = e.getFallbackException().getCause().getMessage();
        return new ResponseEntity<>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 运行时异常handler
     *
     * @param request request
     * @param e       e
     * @return AjaxResult
     * @throws Exception
     */
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<String> runtimeExceptionHandler(HttpServletRequest request, HttpServletResponse response, RuntimeException e) {
        e.printStackTrace();
        String msg = String.format("exceptionType: %s,requestUri: %s,reason: %s", e.getClass().getName(), request.getRequestURI(), e.getMessage());
        log.error(msg);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Exception handler
     *
     * @param request request
     * @param e       e
     */
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> exceptionHandler(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        log.error("requestUri:\n{}", request.getRequestURI(), e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
