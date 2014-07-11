package com.craftedbytes.hazelcar.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dbrimley on 11/07/2014.
 */

public class Server {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-beans.xml");

        System.out.println("wait");

    }

}
