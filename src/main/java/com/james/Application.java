package com.james;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jamespowell on 25/03/15.
 */
@SpringBootApplication
public class Application     {

    public static void main(String[] args) {
        System.out.println("Attempting to run");
        SpringApplication.run(Application.class, args);
    }
}
