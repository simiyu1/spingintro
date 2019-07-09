package com.example.spingintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpingintroApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpingintroApplication.class, args);
        printWelcome();
    }

    public static void printWelcome() {
        System.out.print("Hello World from Spring Boot \uD83C\uDF89");
    }

}
