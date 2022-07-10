package ru.git.hub.practice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping
    public String sayHello(){
        return "Hello my friend!";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi man!";
    }
    @GetMapping("/bye")
    public String sayBye(){
        return "bye man!";
    }
}
