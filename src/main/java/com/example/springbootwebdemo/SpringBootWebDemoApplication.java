package com.example.springbootwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The same as @Configuration @EnableAutoConfiguration @ComponentScan
 * The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes.
 * Many Spring Boot developers like their apps to use auto-configuration, component scan and be able to define extra configuration on their "application class". A single @SpringBootApplication annotation can be used to enable those three features, that is:
 *
 * @author wangpeng
 * @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism(Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies that you have added.)
 * @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
 * @Configuration: allow to register extra beans in the context or import additional configuration classes
 * @date 2018/11/7
 */
@SuppressWarnings("JavaDoc")
@SpringBootApplication
public class SpringBootWebDemoApplication {

    /**
     * Program entry of spring application
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebDemoApplication.class, args);
    }

    /**
     * instantiate and configure MyBean obj
     *
     * @return Example's object
     * @Bean Indicates that a method produces a bean to be managed by the Spring container.
     */
    @Bean
//    @Primary
    public ServiceExample manualServiceExampleBean() {
        System.out.println("=================ManualServiceExampleBean===================");
        return new ServiceExample("ServiceExample");
    }

    @Bean
    public ServiceExample manualServiceExampleNoArgusBean() {
        System.out.println("=================ManualServiceExampleNoArgusBean===================");
        return new ServiceExample();
    }

    /**
     * SpringBoot Application在启动时，会先运行Bean方法，注册相对应的Bean
     *
     * @return BeanExample
     */
    @Bean
    public BeanExample manualBeanExampleBean() {
        System.out.println("=================ManualBeanExampleBean===================");
        return new BeanExample();
    }

    @Bean
    public RepositoryExample manualRepositoryExampleBean() {
        System.out.println("=================ManualRepositoryExampleBean===================");
        return new RepositoryExample("RepositoryExample");
    }
}
