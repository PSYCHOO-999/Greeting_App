package com.bridgelabz.greetingapp.service;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting() {
        return "{ \"message\": \"Hello World\" }";
    }
}
