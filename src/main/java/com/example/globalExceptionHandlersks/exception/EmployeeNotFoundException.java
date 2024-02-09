package com.example.globalExceptionHandlersks.exception;

public class EmployeeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EmployeeNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
