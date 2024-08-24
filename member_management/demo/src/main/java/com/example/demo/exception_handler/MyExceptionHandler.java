package com.example.demo.exception_handler;

import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(ClassNotFoundException exception){
        return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoResultException.class)
    public ResponseEntity<String> handleNoResult(NoResultException exception){
        return new ResponseEntity<>("No result found for the query", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NonUniqueResultException.class)
    public ResponseEntity<String> handleNonUniqueResult(NonUniqueResultException exception){
        return new ResponseEntity<>("Query did not return a unique result", HttpStatus.CONFLICT);
    }
}