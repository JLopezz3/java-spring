package com.example.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.java")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

//    @Bean
//    public Teacher mathTeacherBean(){
//        return new MathTeacher();
//    }
//
//    @Bean
//    public Principal principalBean(){
//        return new Principal();
//    }

    // method name is the bean id/bean name
//    @Bean
//    public College collegeBean(){
//        College college = new College(principalBean());
//        return college;
//    }

//    @Bean
//    public College collegeBean(){
//        College college = new College();
//        college.setPrincipal(principalBean());
//        college.setTeacher(mathTeacherBean());
//        return college;
//    }

}
