package com.zidio.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Opportune Zone!";
    }

    @GetMapping("/port")
    public String hello() {
        return "Hello from Spring Boot on port 8084!";
    }
}
