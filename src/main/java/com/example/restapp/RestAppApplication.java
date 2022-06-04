package com.example.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestAppApplication {

    public static void main(String[] args) {
        // Another change from crystal clear
        //this is the change from bug fix branch
        SpringApplication.run(RestAppApplication.class, args);
    }

    public static void addData(String data) {
        // amazing killer feature right here!!!
        System.out.println(data);
    }

}
