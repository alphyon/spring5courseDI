package io.alphyon.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImp implements GreetingRepository {
    @Override
    public String getSpanishGreeting() {
        return "Hola como estan ";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello how are you";
    }

    @Override
    public String getGermaGreeting() {
        return "en aleman :)";
    }
}
