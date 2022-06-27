package com.example.java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // since there are 2 teachers, math will get called first
public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("Hi I am your math teacher");
        System.out.println("My name is Sourav");
    }
}
