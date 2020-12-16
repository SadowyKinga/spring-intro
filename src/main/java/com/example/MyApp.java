package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService randomMessageService = applicationContext.getBean("randomMessageService", MessageService.class);

        System.out.println("messageService - hashcode -> " + messageService.hashCode());
        System.out.println("randomMessageService - hashcode -> " + randomMessageService.hashCode());

        System.out.println(messageService.getMessage());
        System.out.println(randomMessageService.getMessage());

        applicationContext.close();
    }
}