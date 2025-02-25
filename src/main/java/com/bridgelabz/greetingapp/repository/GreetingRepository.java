package com.bridgelabz.greetingapp.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {
    private final Map<Long, String> greetings = new HashMap<>();
    private long currentId = 1;

    public GreetingRepository() {
        // Adding a default greeting
        greetings.put(currentId++, "Hello World");
    }

    public String saveGreeting(String message) {
        greetings.put(currentId, message);
        return "Greeting saved with ID: " + currentId++;
    }

    public String findGreetingById(Long id) {
        return greetings.getOrDefault(id, "Greeting not found");
    }

    // ✅ New Method to List All Greetings
    public List<String> findAllGreetings() {
        return greetings.entrySet()
                .stream()
                .map(entry -> "ID: " + entry.getKey() + ", Message: " + entry.getValue())
                .collect(Collectors.toList());
    }
}
