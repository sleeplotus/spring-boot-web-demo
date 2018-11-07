package com.example.springbootwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
