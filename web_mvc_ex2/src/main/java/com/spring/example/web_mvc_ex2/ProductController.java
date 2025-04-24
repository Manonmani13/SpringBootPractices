package com.spring.example.web_mvc_ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class ProductController {

    @GetMapping("/")
    public String loadForm(Model model){
        model.addAttribute("product", new Product()); // ✅ CORRECT
        return "index";
    }

    @PostMapping("/product")
    public String handleSumbitBtn(@Valid Product p, BindingResult result, Model model){
        System.out.println(p);
        if(result.hasErrors()){
            return "index"; // show errors
        }
        model.addAttribute("msg", "Product Saved"); // success message
        model.addAttribute("product", new Product()); // reset the form
        return "index";
    }
}
