package com.example.springframework.controllers;

import com.example.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// This is manual dependency Injection
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Here we are using the constructor to set the service and then calling the greeting method
    // here it works even if we don't add autowired because spring has given support for constructor based injections to automatically get wired.
    // We can also add autowired to keep code clean and readable and it works with or with out adding autowired annotation.
    // The bean names when the bean is created it will have the name with smallcase first letter.
    ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting() + " from ConstructorInjectedController" ;
    }

}
