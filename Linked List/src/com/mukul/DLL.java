package com.mukul;

public class DLL {
     Node head;

     public void insertfirst(int val) {
         Node node = new Node(val);
         node.next = head;
         node.prev = null;
         if (head != null) {
             head.prev=node;
         }
         head = node;
     }

     public void insertlast(int val){
         Node node =new Node(val);
         Node last = head;

         if (head==null){
             node.prev=null;
             head = node;
             return;
         }

         while(last.next != null){
             last = last.next;
         }

         node.prev=last;
         last.next=node;
         node.next=null;
     }

     public void insert(int val,int after){
         Node p = find(after);
         if (p==null){
             System.out.println("does not exist");
             return;
         }
         Node node = new Node(val);
         node.next=p.next;
         p.next=node;
         node.prev=p;
         if (node.next !=null) {
             node.next.prev = node;
         }
     }

     public Node find(int value){
         Node node = head;
         while(node != null){
             if (node.val==value){
                 return node;
             }
             node=node.next;
         }
         return null;
     }

     public void display(){
         Node node = head;
         Node last = null;
         while(node!=null){
             System.out.print(node.val + " -> ");
             last = node;
             node = node.next;
         }

         System.out.println("END");


         System.out.println("print in reverse");
         while(last!=null){
             System.out.print(last.val + " -> ");
             last=last.prev;
         }
         System.out.println("START");
     }

//     public void displayRev(){
//         Node node = tail
//     }


    private class Node {
        int val;
        Node next;
        Node prev;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
