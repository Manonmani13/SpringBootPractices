package com.example.spring_batch;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepository extends JpaRepository<Customer,Serializable> {
    
}
