package com.example.greetingapp.controller;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET)
    public String greet() {
        return "Hello, this is Chetan from Bridgelabz";
    }

    @RequestMapping("/query/{name}")
    public String greet1(@PathVariable String name) {
        return "<h1><font color=purple>Hello! This is " + name + " From Bridgelabz!</font></h1>" +
                "</br> <font color=green>Passing name as a path variable.</font>";
    }

    @GetMapping("/query")
    public String getUsers(@RequestParam(value = "name", defaultValue = "Chetan") String name) {
        return "<h1><font color=red>Hello! This is " + name + " From Bridgelabz!</font></h1>" +
                "</br> <font color=black>Passing name as a parameter.</font>";
    }

    @GetMapping("/service")
    public String serviceCall() {
        return greetingService.helloWorld();
    }
    @GetMapping("/user")
    public String greetMessageWithUser(@RequestParam(value = "firstName", defaultValue = "") String firstName,
                                       @RequestParam(value = "lastName", defaultValue = "") String lastName) {
        return greetingService.greetMessageWithUser(firstName, lastName);
    }
    @PostMapping("/post")
    public Greeting addGreeting(@RequestBody Greeting greeting){
        greetingService.greetingMessage(greeting);
        return greeting;
    }
    @GetMapping("/get/{id}")
    public Optional<Greeting> sayHelloById(@PathVariable long id){
        Optional<Greeting> response = greetingService.sayHelloById(id);
        return response;
    }
    @GetMapping("/findAll")
    public List<Greeting> sayToAll (){
        List<Greeting> response = greetingService.sayAll();
        return response;
    }
}