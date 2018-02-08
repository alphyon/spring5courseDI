package io.alphyon.didemo.controllers;

import io.alphyon.didemo.services.GreetingService;
import io.alphyon.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingServiceimpl;

    public String sayHello(){
        return greetingServiceimpl.sayGreeting();
    }


}
