package com.example.springframework.controllers;

import com.example.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        // Here we are using a constructor to inject the service. This is clean and without passing the service to the constructor we cannot create a proper implementation. So this is mostly preferred.
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_PEOPLE, constructorInjectedController.sayHello());
    }
}