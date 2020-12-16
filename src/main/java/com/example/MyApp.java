package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyNameMessageService.class, RandomTextMessageService.class);

        MessageService messageService = ctx.getBean("messageService", MessageService.class);
        MessageService randomMessageService = ctx.getBean("randomMessageService", MessageService.class);

        System.out.println("messageService - hashcode -> " + messageService.hashCode());
        System.out.println("randomMessageService - hashcode -> " + randomMessageService.hashCode());

        System.out.println(messageService.getMessage());
        System.out.println(randomMessageService.getMessage());
    }
}