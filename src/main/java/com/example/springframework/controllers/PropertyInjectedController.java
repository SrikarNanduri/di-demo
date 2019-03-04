package com.example.springframework.controllers;

import com.example.springframework.services.GreetingServiceImpl;

// This is manual dependency Injection
public class PropertyInjectedController {


    // Here as you can see we are injecting the Impl of the greeting instead of the interface, This is a bad pratice and this should not be done
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
