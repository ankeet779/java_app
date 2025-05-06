package com.example.springbootlibertyapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    
    // Add a root endpoint for testing
    @GetMapping("/")
    public String home() {
        return "Welcome to the Spring Boot Liberty App! Try accessing /hello";
    }
}