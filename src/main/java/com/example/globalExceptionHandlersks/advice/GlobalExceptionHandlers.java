package com.example.globalExceptionHandlersks.advice;

import com.example.globalExceptionHandlersks.exception.ErrorDetail;
import com.example.globalExceptionHandlersks.exception.ErrorDetails;
import com.example.globalExceptionHandlersks.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlers extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)

    public ResponseEntity<ErrorDetail> userNotFoundException(UserNotFoundException ex) {

        ErrorDetail errorModel = new ErrorDetail(0, ex.getMessage());

        return new ResponseEntity < ErrorDetail> (errorModel, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)

    public ResponseEntity < ? > globleExcpetionHandler(Exception ex) {

        ErrorDetail errorModel = new ErrorDetail(0, ex.getMessage());

        return new ResponseEntity < > (errorModel, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
