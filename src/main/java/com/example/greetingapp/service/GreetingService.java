package com.example.greetingapp.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService  {
    public String helloWorld() {
        return "Hello World.....";
    }

    public String greetMessageWithUser(String firstName, String lastName) {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return helloWorld();
        } else if (lastName.equals("") && !firstName.equals("")) {
            return "Hello " + firstName ;
        } else if (!lastName.equals("") && firstName.equals("")) {
            return "Hello " + lastName ;
        }
        return "Hello " + firstName +" "+ lastName ;
    }
}