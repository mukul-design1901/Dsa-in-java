package com.mukul.Singelton;

public class Main {
    static void main() {
        Singelton obj= Singelton.getinstance();

        Singelton obj2= Singelton.getinstance();

        Singelton obj3 = Singelton.getinstance();

        // all 3 ref variables are pointing towards just one object
    }
}
