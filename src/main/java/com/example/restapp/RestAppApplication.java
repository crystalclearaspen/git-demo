package com.example.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestAppApplication {

    public static void main(String[] args) {
        // Another change from crystal clear
        // another change from dev branch
        SpringApplication.run(RestAppApplication.class, args);
    }

    public static void addData(String data) {
        System.out.println(data);
    }

}
