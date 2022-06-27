package com.example.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student jerel = context.getBean("student", Student.class);
        jerel.displayStudentInfo();

        Student dilip = context.getBean("dilip", Student.class);
        dilip.displayStudentInfo();



    }
}
