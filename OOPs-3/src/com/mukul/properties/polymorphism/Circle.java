package com.mukul.properties.polymorphism;

public class Circle extends Shapes {

    // this will run when obj of Circlr is created
    // hence it is overriding the parent method
    @Override // this is called annotation

    void area(){
        System.out.println("area is pi * r * r");
    }
}
