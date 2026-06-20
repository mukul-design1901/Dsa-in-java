package com.mukul;

import java.util.*;

public class InBuiltExample {
    static void main() {

        // STACK

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(69);
        stack.push(79);
        stack.push(89);
        System.out.println(stack);

        System.out.println(stack.pop()); // removes an element
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); // will give exception because the stack is empty now
       System.out.println(stack.peek()); // tells the peek element means top element
      System.out.println(stack.empty()); // tells that stack is empty or not

        // QUEUE

//        Queue<Integer> queue = new LinkedList<>(); // beacuse Queue is interface it does not have its own class
//        queue.add(3);
//        queue.add(5);
//        queue.add(7);
//        queue.add(9);
//        queue.add(11);
//        System.out.println(queue.peek());
//        queue.remove();
//        System.out.println(queue);


        // DECK (DEQUE)
//
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(89);
//        deque.addLast(45);
//        deque.addFirst(69);
//        // etc etc
//        deque.add(88);
//        System.out.println(deque);

    }
}
