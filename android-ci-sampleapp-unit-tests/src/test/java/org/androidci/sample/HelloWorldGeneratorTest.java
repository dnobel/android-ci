package org.androidci.sample;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldGeneratorTest {

    HelloWorldGenerator helloWorldGenerator;

    @Before
    public void setup() {
        helloWorldGenerator = new HelloWorldGenerator();
    }

    @Test
    public void shouldGenerateHelloWorld() {
        String helloWord = helloWorldGenerator.generateHelloWord();
        assertThat(helloWord, is(equalTo("Hello World")));
    }

}
