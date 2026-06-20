package com.mukul.ExceptionHandling;

public class Main {
    static void main() {
        int a = 0;
        int b=5;
//        try {
//            int c = b / a;
//        }

        try {
 //           divide(a,b);
            String name= "Mukul";
            if(name.equals("Mukul")){
                throw new MyException("name is Mukul");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
            catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        catch (Exception e){
            System.out.println("normal exception");
        }
//        finally {
//            System.out.println("this will always execute  ");
//        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if (a==0){
            throw new ArithmeticException("please do not divide by zero");
        }

        return b/a;
    }
}
