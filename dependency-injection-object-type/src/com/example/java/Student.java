package com.example.java;

public class Student {

    private int id;
    private MathCheat mathCheat;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cheating(){
        mathCheat.mathCheat(); // calling the mathCheat object, to the mathCheat method
        System.out.println("Hey my id is " + id + " take and do whatever you want to do");
    }
}
