package com.javanauta.apiusuario.infrastructure.controller;

import com.javanauta.apiusuario.infrastructure.exception.ConflictException;
import com.javanauta.apiusuario.infrastructure.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResouceNotFoundException(ResourceNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<String> HandleConflictException(ConflictException ex){
        return  new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}
