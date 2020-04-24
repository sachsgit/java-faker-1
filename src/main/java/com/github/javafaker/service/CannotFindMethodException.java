package com.github.javafaker.service;

public class CannotFindMethodException extends RuntimeException {
    private static final long serialVersionUID = -4855449558273637714L;

    public CannotFindMethodException(String message) {
        super(message);
    }

    public CannotFindMethodException(Throwable cause) {
        super(cause);
    }

    public CannotFindMethodException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotFindMethodException(String message, Throwable cause, boolean enableSuppression,
        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
