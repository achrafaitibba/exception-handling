package com.achrafaitibba.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private final String message;
    private final Integer httpStatusNumber;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;

    public ApiException(String message,
                        HttpStatus httpStatus,
                        Integer httpStatusNumber,
                        ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatusNumber = httpStatusNumber;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
        System.out.println(getClass().getName());

    }
    public String getMessage() {
        return message;
    }

    public Integer getHttpStatusNumber(){
        return httpStatusNumber;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
