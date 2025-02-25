package com.bridgelabz.greetingapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingapp.repository.GreetingRepository;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    public String getGreetingById(Long id) {
        return greetingRepository.findGreetingById(id).orElse("Greeting not found");
    }
}
