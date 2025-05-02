package com.sample.jaxb_app;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class UnMarshellingDemo {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(Person.class);
        Unmarshaller marshaller=context.createUnmarshaller();
        Person p=(Person) marshaller.unmarshal(new File("person.xml")); 

    }
}
