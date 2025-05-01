package com.sample.jaxb_app;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class MarshellingDemo {
    public static void main(String[] args) throws JAXBException {
        Person p=new Person();
        p.setId(101);
        p.setEmail("manonmani.pandukumar@gmail.com");
        p.setName("Manonmani");
        p.setGender("Female");
        JAXBContext context=JAXBContext.newInstance(Person.class);
        Marshaller marshaller=context.createMarshaller();
        marshaller.marshal(p, new File("person.xml"));
    }
}
