package com.mukul.staticExample;

import static com.mukul.packages.Messaage.message;

public class Main {
    static void main() {
//        Human mukul = new Human(20,"Mukul",50000,true);
//        Human kunal= new Human(23,"kunal",25000,false);
//        System.out.println(mukul.age+ " " +  mukul.name+ " " + mukul.salary+ " "+ mukul.married);
//        message();
//        System.out.println(Human.population);
//        System.out.println(Human.population);
       fun();

    }
    // this is not dependent on objects
    static void fun(){
      //   greeting();
        // you can't use this because it an  instance
        // but the function you are it in does not depend on instances

        // you can not access non static stuff without referencing their instaces in
        // a static context

        // hence .here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }
    // we know that something which is not static, belongs to objects
     void greeting(){
         //      fun();
        System.out.println("Hello");
    }
}
