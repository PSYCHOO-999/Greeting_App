package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String updateGreeting(Long id, String newMessage) {
        return greetingRepository.updateGreeting(id, newMessage);
    }
}
