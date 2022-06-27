package com.example.java;

public class Student {

    private Cheat cheat; // interface reference

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void cheating(){
        cheat.cheat();
    }


}
