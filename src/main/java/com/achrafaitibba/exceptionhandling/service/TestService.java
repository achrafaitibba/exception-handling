package com.achrafaitibba.exceptionhandling.service;

import com.achrafaitibba.exceptionhandling.enumeration.CustomErrorMessage;
import com.achrafaitibba.exceptionhandling.exception.BusinessException;
import com.achrafaitibba.exceptionhandling.exception.RequestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    public String testException(String name){
        if(!name.equals("test")){
            throw new BusinessException(CustomErrorMessage.USER_NOT_FOUND.getMessage());
        }else {
            return name;
        }
    }
    public String testException_(String name){
        if(!name.equals("test")){
            throw new RequestException(CustomErrorMessage.USER_NOT_FOUND.getMessage(), HttpStatus.BAD_REQUEST);
        }else {
            return name;
        }
    }
}
