package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String deleteGreeting(Long id) {
        return greetingRepository.deleteGreeting(id);
    }
}
