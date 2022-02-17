package org.example;

import kamon.Kamon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class KamonSpringApplication {
    public static void main(String... args) {

        Kamon.start();

        SpringApplication.run(KamonController.class, args);

    }
}