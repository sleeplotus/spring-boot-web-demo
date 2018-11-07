package com.example.springbootwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

// The same as @Configuration @EnableAutoConfiguration @ComponentScan
// The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes.
// Many Spring Boot developers like their apps to use auto-configuration, component scan and be able to define extra configuration on their "application class". A single @SpringBootApplication annotation can be used to enable those three features, that is:
// @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism(Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies that you have added.)
// @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
// @Configuration: allow to register extra beans in the context or import additional configuration classes
@SpringBootApplication
public class SpringBootWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebDemoApplication.class, args);
    }
}
