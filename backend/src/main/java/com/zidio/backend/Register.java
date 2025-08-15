package com.zidio.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // used to control and connect html pages
public class Register {
    @GetMapping("/register")
    public String registeration() {
        return "redirect:/register.html";
    }
}