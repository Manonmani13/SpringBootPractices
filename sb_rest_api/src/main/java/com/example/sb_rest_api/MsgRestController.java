package com.example.sb_rest_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MsgRestController {

    public MsgRestController(){
        System.out.println("MsgRestController :: constructor");
    }

    @GetMapping("/wecome")
    public ResponseEntity<String> getMethodName() {
        String msg="WElcome to Ashok IT";
        return new ResponseEntity<>(msg,HttpStatus.OK);
    }
    
    
}
