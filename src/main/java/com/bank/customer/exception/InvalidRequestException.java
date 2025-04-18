package com.bank.customer.exception;

import com.sun.jdi.request.InvalidRequestStateException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidRequestException extends RuntimeException {
    public InvalidRequestException(String message){
        super(message);
    }
}