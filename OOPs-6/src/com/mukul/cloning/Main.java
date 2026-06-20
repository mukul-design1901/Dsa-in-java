package com.mukul.cloning;

public class Main {
    static void main() throws CloneNotSupportedException{
        Human mukul = new Human(20,"Mukul");
  //      Human twin = new Human(mukul);

        Human twin =(Human)mukul.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
