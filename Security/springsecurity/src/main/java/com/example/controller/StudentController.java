package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {

    List<com.example.model.Student> students=new ArrayList<>(
        Arrays.asList(
            new Student(1,"mano","java"),
            new Student(2,"naveen","full stack")

        )
    );

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    
    @GetMapping("/students")
    public void savStudents(@RequestBody Student student) {
         students.add(student);
    }
    
    @GetMapping("/csrf-toke")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
