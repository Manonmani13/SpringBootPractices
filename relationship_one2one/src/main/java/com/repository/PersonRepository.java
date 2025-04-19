package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.model.Person;

public interface PersonRepository  extends JpaRepository<Person,Integer>{
    
}
