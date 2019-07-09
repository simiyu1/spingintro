package com.example.spingintro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpingintroApplicationTests {

    //this will hold data from the System.out.print()
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void contextLoads() {
        SpingintroApplication myspring = new SpingintroApplication();
        myspring.printWelcome();
        Assert.assertEquals("Hello World from Spring Boot 🎉", outContent.toString());
    }

    // Test added ONLY to cover main() invocation not covered by application tests.
    @Test
    public void applicationContextTest() {
        SpingintroApplication.main(new String[] {});
    }

}
