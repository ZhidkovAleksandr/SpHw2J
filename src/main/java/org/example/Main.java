package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DogConfig.class);
        Dog d = ctx.getBean("malinua", Dog.class);
        System.out.println(d);
    }
}