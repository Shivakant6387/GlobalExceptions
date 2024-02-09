package com.example.globalExceptionHandlersks.exception;

public class DuplicateEmployeeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DuplicateEmployeeException(String errorMessage) {
        super(errorMessage);
    }
}
