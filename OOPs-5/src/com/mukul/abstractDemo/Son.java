package com.mukul.abstractDemo;

public class Son extends Parent{


    public Son(int age){
        this.age=age;
    }

    @Override
    void career(){
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner(){
        System.out.println("I love Capatain America");
    }
}
