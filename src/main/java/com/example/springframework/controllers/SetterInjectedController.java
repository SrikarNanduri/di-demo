package com.example.springframework.controllers;

import com.example.springframework.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        return greetingService.sayGreeting();
    }

}
