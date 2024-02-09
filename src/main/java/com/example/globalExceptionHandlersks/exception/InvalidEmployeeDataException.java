package com.example.globalExceptionHandlersks.exception;

public class InvalidEmployeeDataException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidEmployeeDataException(String errorMessage) {
        super(errorMessage);
    }
}
