package com.example.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {

//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();
//
//        Vodaphone vodaphone = new Vodaphone();
//        vodaphone.calling();
//        vodaphone.data();
//            ----------------
        // because we are calling the object, it's not efficient to have to change the code each time.

        // better to use this code below
//        Sim sim = new Vodaphone();
//        sim.calling();
//        sim.data();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // the framework is creating the object for us
        System.out.println("config loaded");

//        Airtel air = (Airtel)context.getBean("airtel"); // must do casting for Airtel
//        air.calling();
//        air.data();

//        Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
//        voda.calling();
//        voda.data();

        // loads the Sim interface
        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
    }
}
