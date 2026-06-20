package com.mukul;

public class Main {
    static void main() {
//        LL list = new LL();
//        list.insertfirst(3);
//        list.insertfirst(2);
//        list.insertfirst(6);
//        list.insertfirst(17);
//        list.insertlast(99);
//        list.insertatposition(52,2);
//        System.out.println(list.deletefirst());
//        System.out.println(list.deletelast());
//        list.display();
//        System.out.println(list.delete(2));
//
//        list.display();

        CLL list = new CLL();
        list.insert(4);
        list.insert(5);
        list.insert(10);
        list.insert(19);
        list.display();

        list.insert(25);
        list.display();
        list.delete(10);
        list.display();
    }
}
