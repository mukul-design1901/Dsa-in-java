package com.mukul;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
       if (isFull()){
           System.out.println("stack is full");
           return false;
       }

        ptr++;
        data[ptr]=item;
        return true;
        }

        public boolean isFull(){
        return ptr == data.length-1; //ptr at last index
        }

        private boolean isEmpty(){
        return ptr == -1;
        }

        public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("cannot pop an item as stack is empty");
        }

//        int removed =data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
        }

        public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot get peek as stack is empty");
        }
        return data[ptr];
        }
    }

