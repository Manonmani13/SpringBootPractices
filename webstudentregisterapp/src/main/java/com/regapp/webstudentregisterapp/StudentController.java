package com.regapp.webstudentregisterapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/")
    public String loadForm(Model model) {
        List<String> courses = Arrays.asList("Java", "DevOps", "AWS", "Python");
        List<String> timings = Arrays.asList("Morning", "Afternoon", "Evening");

        model.addAttribute("courses", courses);
        model.addAttribute("timings", timings);
        model.addAttribute("student", new Student());

        return "index";
    }

    @PostMapping("/save")
    public String handleSubmit(Student s,Model model) {
        Student sctudent=new Student();
        BeanUtils.copyProperties(s, student);
        student.setTimings(Arrays.toString(s.getTimings()));
        repo.save(student);
        model.addAttribute("msg", model);
        return "index";
    }
    
}
