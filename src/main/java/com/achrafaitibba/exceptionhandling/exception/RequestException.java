package com.achrafaitibba.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class RequestException extends RuntimeException{

    private HttpStatus httpStatus;
//    public requestException(String message) {
//        super(message);
//    }

    public RequestException(String message, HttpStatus httpStatus){
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
}
