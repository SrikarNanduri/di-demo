package com.example.springframework.controllers;

import com.example.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// This is manual dependency Injection
// Controller annotation needs to be added for spring to identify it as a spring bean but just adding annotation won't solve it and we get a NullPointerException at sayHello.
@Controller
public class PropertyInjectedController {


    // Here as you can see we are injecting the Impl of the greeting instead of the interface, This is a bad pratice and this should not be done
    // So we need to add autowired to say spring to wire this.
    @Autowired
    GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting() + " from PropertyInjectedController";
    }

}
