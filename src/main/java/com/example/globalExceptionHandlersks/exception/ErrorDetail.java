package com.example.globalExceptionHandlersks.exception;

public class ErrorDetail {
    private Integer status;

    private String message;

    public ErrorDetail(Integer status, String message) {

        super();

        this.status = status;

        this.message = message;

    }

    public Integer getStatus() {

        return status;

    }

    public String getMessage() {

        return message;

    }
}
