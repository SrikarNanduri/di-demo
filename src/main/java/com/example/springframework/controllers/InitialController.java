package com.example.springframework.controllers;


import com.example.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InitialController {

    // Refactoing this to take in the greeting service.
    @Autowired
    private GreetingService greetingService;

     public String hello(){
         System.out.println("Hello From Initial controller");

         return greetingService.sayGreeting();
     }
}
