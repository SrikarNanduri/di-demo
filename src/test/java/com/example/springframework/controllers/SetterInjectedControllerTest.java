package com.example.springframework.controllers;

import com.example.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {

        // Here as we can see we are setting the GreetingServiceImpl using the setter injection.
        this.setterInjectedController = new SetterInjectedController();
        // Above we have created the object and if we were to not pass the service to the setter it will throw a NPE. To check it out comment the below line. In case of constructor based injection
        // we won't have a NPE because with out passing the service we cannot create the object so it's mostly preferred.
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_PEOPLE, setterInjectedController.sayHello());
    }

}