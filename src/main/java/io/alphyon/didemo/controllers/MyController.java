package io.alphyon.didemo.controllers;

import io.alphyon.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String hello() {
        System.out.println("Hello !!!");
        return greetingService.sayGreeting();
    }
}
