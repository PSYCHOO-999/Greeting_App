package com.bridgelabz.greetingapp.service;
import org.springframework.stereotype.Service;
import com.bridgelabz.greetingapp.dto.UserDTO;

@Service
public class GreetingService {
    public String getGreeting() {
        return "{ \"message\": \"Hello World\" }";
    }

    public String getPersonalizedGreeting(UserDTO user) {
        if (user.getFirstName() != null && user.getLastName() != null) {
            return "{ \"message\": \"Hello, " + user.getFirstName() + " " + user.getLastName() + "!\" }";
        } else if (user.getFirstName() != null) {
            return "{ \"message\": \"Hello, " + user.getFirstName() + "!\" }";
        } else if (user.getLastName() != null) {
            return "{ \"message\": \"Hello, " + user.getLastName() + "!\" }";
        } else {
            return getGreeting();
        }
    }
}
