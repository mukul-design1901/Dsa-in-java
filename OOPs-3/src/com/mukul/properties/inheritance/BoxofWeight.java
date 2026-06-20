package com.mukul.properties.inheritance;

public class BoxofWeight extends Box {
    double weight;

    public BoxofWeight(){
        this.weight= -1;
    }

    public BoxofWeight(double length,double width,double height,double weight){
        super(length, width, height);// what is this?
        // call the parent parent class constructor
        // used to initialize values present in parent class
        this.weight=weight;
    }
}
