package com.mukul.staticExample;
// this is the demo to show the initialization of static variable
public class SatiticInt {
    static int a =4;
    static int b;

    static {
        System.out.println("i am in static block");
        b=a*5;
    }

    static void main() {
        SatiticInt obj = new SatiticInt();
        System.out.println(SatiticInt.a+ " " + SatiticInt.b);

        SatiticInt.b += 3;
        System.out.println(SatiticInt.a+ " " + SatiticInt.b);

        SatiticInt obj2 = new SatiticInt();
        System.out.println(SatiticInt.a+ " " + SatiticInt.b);
    }


}
