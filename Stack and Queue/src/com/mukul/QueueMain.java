package com.mukul;


public class QueueMain {
    static void main() throws Exception {

//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(5);
//        queue.insert(6);
//        queue.insert(12);
//        queue.insert(15);
//        queue.insert(19);
//        queue.display();
//
//     System.out.println(queue.remove());
//     queue.display();

        CircularQueue queue=new CircularQueue(5);
        queue.insert(45);
        queue.insert(50);
        queue.insert(55);
        queue.insert(60);
        queue.insert(65);

        queue.display();
        System.out.println(queue.remove());
        queue.display();

    }
}
