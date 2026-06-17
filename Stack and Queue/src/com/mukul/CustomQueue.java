package com.mukul;

public class CustomQueue {
    private int[] data;

    private static final int DEFAULT_SIZE=10;

    int end = 0;
    int front=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws  Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front++];
    }

    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for (int i=front;i<end;i++){
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
    }


}
