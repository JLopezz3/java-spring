package com.example.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    // @autowired first tries to revolve with "byType"
    // if byType fails then it goes with "byName
    // put autowired before the dependency, so you do not need to create setters

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

//    public Human() {
//
//    }
//
//    public Human(Heart heart) {
//        this.heart = heart;
//        System.out.println("human constr is getting called which has Heart as arg");
//    }
//
//    public void setHeart(Heart heart) {
//        this.heart = heart;
//        System.out.println("setter method is called");
//    }

    public void startPumping(){
        if(heart != null){
            heart.pump();
            System.out.println("name of the animal is : " + heart.getNameOfAnimal() + ", no of heart present : " + heart.getNoOfHeart());
        } else {
            System.out.println("you are dead");
        }

    }
}
