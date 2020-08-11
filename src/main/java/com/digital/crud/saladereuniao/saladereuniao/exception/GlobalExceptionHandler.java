package com.digital.crud.saladereuniao.saladereuniao.exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler (RosourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(RosourceNotFoundException ex, WebRequest request) {
        ErrorDatails errorDatails=new ErrorDatails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDatails, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public  ResponseEntity<?>globalExceptionHandler(Exception ex, WebRequest request){
        ErrorDatails errorDatails=new ErrorDatails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDatails,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
