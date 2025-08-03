package com.zidio.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public void home() {
        System.out.println("Welcome to Opportune Zone");
    }
}
