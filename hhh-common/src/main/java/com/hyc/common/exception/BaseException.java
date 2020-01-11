package com.hyc.common.exception;

import lombok.Data;

/**
 * @author hyc
 * @description
 * @date 2019-05-11 12:58
 */
@Data
public class BaseException extends RuntimeException {

    private int code = 500;

    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
    }

}
