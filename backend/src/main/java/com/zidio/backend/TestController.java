package com.zidio.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String home() {
        return "Welcome to Opportune Zone Test Controller";
    }
}
