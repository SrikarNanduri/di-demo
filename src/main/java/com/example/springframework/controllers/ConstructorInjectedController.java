package com.example.springframework.controllers;

import com.example.springframework.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Here we are using the constructor to set the service and then calling the greeting method
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
