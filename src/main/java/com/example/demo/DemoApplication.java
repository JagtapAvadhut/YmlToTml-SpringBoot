package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Value("${data.name}")
    private String name;

    @Value("${data.position}")
    private String position;

    @Value("${data.company}")
    private String company;

    @Value("${data.location}")
    private String location;

    @Value("${data.age}")
    private int age;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Company: " + company);
        System.out.println("Location: " + location);
        System.out.println("Age: " + age);



    }
}
