package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService  {
    @Autowired
    public Repo repository;
    public String helloWorld() {
        return "Hello World.";
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
    public Greeting greetingMessage(Greeting greeting){
        repository.save(greeting);
        return greeting;
    }
    public Optional<Greeting> sayHelloById(long id) {
        return repository.findById(id);

    }
    public List<Greeting> sayAll(){
        return repository.findAll();
    }
}

