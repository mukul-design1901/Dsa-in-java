package com.mukul.properties.polymorphism;

public class Main {
    static void main() {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
