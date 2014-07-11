package com.craftedbytes.hazelcar.bootstrap;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dbrimley on 11/07/2014.
 */


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Server {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Server.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }


}
