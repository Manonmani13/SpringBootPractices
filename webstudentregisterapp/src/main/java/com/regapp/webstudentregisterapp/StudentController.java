package com.regapp.webstudentregisterapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/")
    public String loadForm(Model model) {
        List<String> courses = Arrays.asList("Java", "DevOps", "AWS", "Python");
        List<String> timings = Arrays.asList("Morning", "Afternoon", "Evening");

        model.addAttribute("courses", courses);
        model.addAttribute("timings", timings);
        model.addAttribute("student", new Student());

        return "index";
    }
}
