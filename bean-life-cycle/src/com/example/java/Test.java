package com.example.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Spring Bean Life Cycle
        // 1. Bean Instantiated
        // 2. Dependency Injected
        // 3. Your Custom Init Method
        // 4. Bean Is Ready To Use


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentDAO studentDao = context.getBean("studentDAO", StudentDAO.class);
        System.out.println(studentDao);
        studentDao.selectAllRows();

        // we must manually close the ApplicationContext because it is standalone app
        ((ClassPathXmlApplicationContext)context).close();
    }
}
