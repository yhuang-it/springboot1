package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/proper")
    public String properGreeting() {
        return "Cherrio...gov";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye for now";
    }
}
