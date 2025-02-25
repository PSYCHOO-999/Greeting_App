package com.bridgelabz.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bridgelabz.greetingapp.service.GreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/{id}")
    public String getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
}
