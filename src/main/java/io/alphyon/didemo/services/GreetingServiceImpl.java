package io.alphyon.didemo.services;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_GURUS = "Hello Gurus !!! __ original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
