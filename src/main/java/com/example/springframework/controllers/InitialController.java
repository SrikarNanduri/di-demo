package com.example.springframework.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class InitialController {


     public String hello(){
         System.out.println("Hello From Initial controller");

         return "foo";
     }
}
