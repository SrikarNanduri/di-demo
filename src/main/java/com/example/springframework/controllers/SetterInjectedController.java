package com.example.springframework.controllers;

import com.example.springframework.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    // Here we are setting the service using a setter and then calling the service method.
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        return greetingService.sayGreeting();
    }

}
