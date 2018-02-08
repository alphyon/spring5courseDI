package io.alphyon.didemo.controllers;

import io.alphyon.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectController propertyInjectController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectController = new PropertyInjectController();
        this.propertyInjectController.greetingServiceimpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectController.sayHello());
    }
}
