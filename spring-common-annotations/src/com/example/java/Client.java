package com.example.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        // annotation Config Application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

        College college = context.getBean("college", College.class);
        System.out.println("The college object created by spring is : " + college);
        college.test();
        context.close();


    }
}
