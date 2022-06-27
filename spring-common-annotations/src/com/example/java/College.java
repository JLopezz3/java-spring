package com.example.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")  does the same thing as bean, so no need to create in .xml file
@Component
public class College {

    @Value("${college.Name}")
    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher") // specifies which teacher to use
    private Teacher teacher;

    public void test(){
        principal.principalInfo();
        teacher.teach();
        System.out.println("My college Name is : " + collegeName);
        System.out.println("testing this class methods");
    }

}
