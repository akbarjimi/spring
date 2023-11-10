package com.akbarjimi.restservice;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

    private Greeting greeting = new Greeting(1, "test");

    @Test
    public void greeterSaysHello() {
        assertThat(greeting.content(), containsString("testx"));
    }

}