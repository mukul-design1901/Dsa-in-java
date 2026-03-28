package com.mukul.properties.inheritance;

public class Box {
   double length;
    double width;
    double height;

    Box(){
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }

    //cube
    Box(double side){
        this.length=side;
        this.width=side;
        this.height=side;
    }

    Box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    Box(Box old){
        this.length=old.length;
        this.width= old.width;
        this.height= old.height;
    }

    public void information(){
        System.out.println("Running the Box");
    }
}

