package com.example.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

//        Student student = new Student();
//        MathCheat cheat = new MathCheat();
//        student.setMathCheat(cheat);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans.xml file loaded");
        Student student = context.getBean("stu", Student.class);
        student.cheating();


    }
}
