package com.example.springbootwebdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExample {

    public ControllerExample(RepositoryExample repositoryExample) {
        System.out.println("=================ControllerExample Parameter 0===================");
    }

    /**
     * Spring Team recommends: "Always use constructor based dependency injection in your beans. Always use assertions for mandatory dependencies".
     *
     * @param manualServiceExampleBean Bean of Service
     */
    @Autowired
    public ControllerExample(ServiceExample manualServiceExampleBean) {
        System.out.println("=================ControllerExample Parameter 1===================");
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
