package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public List<String> getAllGreetings() {
        return greetingRepository.findAllGreetings();
    }
}
