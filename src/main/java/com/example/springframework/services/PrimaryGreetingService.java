package com.example.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
// Here we are setting @Primary to say to spring that if there is no Qualifier specified then use this as the Primary greeting service.
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}
