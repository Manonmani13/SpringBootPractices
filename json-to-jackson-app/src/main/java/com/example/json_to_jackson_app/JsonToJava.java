package com.example.json_to_jackson_app;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonToJava {
    public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
        ObjectMapper obj=new ObjectMapper();
        Passenger p=obj.readValue(new File("passenger.json"), Passenger.class);
        System.out.println(p.toString());

        //another way
          Gson gson =new Gson();
        System.out.println(gson.fromJson(new FileReader("passenger.json"),Passenger.class));
    }
}
