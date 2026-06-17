package com.mukul.Qusetions;

import java.util.Stack;

public class QueusingStacks {
//     in quue first in first out
//    in stack last in first out
//    so we will use two stack
//    beacuse insertion is same just adding one by one only but removal is differeent for que and stack
//    so we add items in first stack than load them in second stack from one
//    then we will remove from 2nd stack
//     for better visualiztion draw all above things on pen and paper
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueusingStacks(){
        first=new Stack<>();
        second=new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int removed=second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;

    }
}

 class Main{
    static void main() throws Exception{
        QueusingStacks que = new QueusingStacks();
        que.add(5);
        que.add(10);
        que.add(15);
        System.out.println(que.peek());
        System.out.println(que.remove());
        System.out.println(que.peek());
    }
}
