package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.UserDTO;
import com.bridgelabz.greetingapp.entity.GreetingEntity;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        return greetingService.getGreeting();
    }

    @PostMapping("/personalized")
    public String getPersonalizedGreeting(@RequestBody UserDTO user) {
        return greetingService.getPersonalizedGreeting(user);
    }

    @GetMapping("/all")
    public List<GreetingEntity> getAllGreetings() {
        return greetingService.getAllGreetings();
    }
}
