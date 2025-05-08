package com.example.rest_api_exception_hanlding;

import java.net.http.HttpRequest;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value=CustomNotFouncdExceptioin.class)
    public ResponseEntity<ExcepptionInfo> handleCnfe(CustomNotFouncdExceptioin customerRestController){
            ExcepptionInfo info=new ExcepptionInfo();
            info.setCode("EX001");
            info.setMsg(customerRestController.getMessage());
            info.setDate(LocalDateTime.now());
            return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
    }
    
}
