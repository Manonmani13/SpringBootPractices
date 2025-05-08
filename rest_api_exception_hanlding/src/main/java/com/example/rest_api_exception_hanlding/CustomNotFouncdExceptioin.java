package com.example.rest_api_exception_hanlding;

public class CustomNotFouncdExceptioin extends RuntimeException {
    public CustomNotFouncdExceptioin(){

    }

    public CustomNotFouncdExceptioin(String msg){
        super(msg);
    }
}
