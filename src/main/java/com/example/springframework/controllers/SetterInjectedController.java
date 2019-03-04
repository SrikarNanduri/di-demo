package com.example.springframework.controllers;

import com.example.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// This is manual dependency Injection
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // Here we are setting the service using a setter and then calling the service method.
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        return greetingService.sayGreeting() + " from SetterInjectedController";
    }

}
