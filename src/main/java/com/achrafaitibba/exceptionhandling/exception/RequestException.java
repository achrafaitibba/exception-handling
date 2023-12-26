package com.achrafaitibba.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class RequestException extends RuntimeException{

    private final HttpStatus httpStatus;

    public RequestException(String message, HttpStatus httpStatus){
        super(message);
        this.httpStatus = httpStatus;
        System.out.println(getClass().getName());
    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
}
