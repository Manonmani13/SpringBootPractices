package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.model.Passport;

public interface PassportRepository  extends JpaRepository<Passport,Integer>{
    
}
