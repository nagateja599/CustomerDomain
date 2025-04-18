package com.bank.customer.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //handle Customer Not Found Exception
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException ex){
        logger.warn("Invalid customer {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    //handle Invalid Request Body Exception
    public ResponseEntity<String> handleInvalidRequestBodyException(InvalidRequestException ex){
        logger.warn("Invalid Request Body {}",ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    //handle Un Authorised Users
    public ResponseEntity<String> handleUnAuthorizedUsers(SecurityException ex){
        logger.warn("Invalid authorizer {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
    }

    //handle Forbidden Access
    public ResponseEntity<String> handleForbidden(IllegalAccessException ex){
        logger.warn("Invalid Access {}",ex.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
    }

    //handle All other Exceptions 500 error
    public ResponseEntity<String> handleGeneralExceptions(Exception ex){
        logger.warn("Internal server error {}",ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }
}
