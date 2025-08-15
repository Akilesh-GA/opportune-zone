package com.zidio.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {
    @GetMapping("/")
    public String welcome() {
        return "redirect:/welcome.html";
    }    
}
