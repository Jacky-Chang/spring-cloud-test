package com.example.middle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MiddleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddleApplication.class, args);
    }

}

