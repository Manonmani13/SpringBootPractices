package com.example.json_to_jackson_app;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JavaToJson {
    public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
        Passenger p=new Passenger();
        p.setFrom("HYD");
        p.setFrom("Delhi");
        p.setGender("Male");
        p.setName("Ashok");

        ObjectMapper mapper=new ObjectMapper();

        mapper.writeValue(new File("passenger.json"), p);

        System.out.println( );

        //another way

        Gson gson =new Gson();
        System.out.println(gson.toJson(p));
    }
    
}
