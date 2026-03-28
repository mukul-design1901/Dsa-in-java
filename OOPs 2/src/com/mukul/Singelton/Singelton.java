package com.mukul.Singelton;

public class Singelton {
    private int num = 0;
    private Singelton(){

    }
    private static Singelton instance;

    public static Singelton getinstance(){
// check whether 1 obj only is created or not
        if(instance == null){
            instance = new Singelton();
        }
        return instance;
    }
}
