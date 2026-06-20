package com.mukul.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.married=married;
        this.population+=1;
    }
}
