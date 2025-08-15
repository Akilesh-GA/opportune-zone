package com.zidio.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Login {
    @GetMapping("/login")
    public String login() {
        return "redirect:/login.html";
    }
}
