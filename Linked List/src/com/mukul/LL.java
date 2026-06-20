package com.mukul;

public class LL {
    private Node head;
    private Node tail;
    private int size;
            public LL() {
        this.size=0;
    }


    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;// iska matlab hai ki jo node bnayi hai wo kha aayegi
        // matlab ki node ke next me head hona chaiye uske baad jo node bnayi use head bnado
        head = node;

        if (tail == null){
            tail= head;
        }
        size+=1;
    }
    public void insertlast(int val){
        if (tail==null){
            insertfirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next=node;// iska matlab hai jo node bnayi hai wo tail thi uske nest me honi chahiye
        // aur fir use tail bnaodo
        tail= node;
        size++;
    }

    public void insertatposition(int val,int index){
                if(index==0){
                    insertfirst(val);
                    return;
                }
                if (index==size){
                    insertlast(val);
                    return;
                }
                Node temp = head;
                for (int i=1;i<index;i++){
                    temp = temp.next;
                }

                Node node = new Node(val,temp.next);
                temp.next = node;
                size++;
    }

    public void insertionRec(int val,int index){
                

    }

    public Node get(int index){
                Node node =head;
                for (int i =0;i<index;i++){
                    node=node.next;
                }
                return node;
    }

    public int deletefirst(){
                int val = head.value;
                head = head.next;
                if(head==null){
                    tail = null;
                }
                size--;
                return val;

    }

    public int delete(int index){
                if (index==0){
                    return deletefirst();

                }

                if (index==size){
                    return deletelast();

                }

               Node prev = get(index-1);
                int val = prev.next.value;

              prev.next=  prev.next.next;

                return val;

    }

    public int deletelast(){
                if (size<=1){
                    return deletefirst();
                }

                Node secondlast = get(size-2);
                int val = tail.value;
                tail=secondlast;
                tail.next=null;
                return val;

    }

    public void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.value + " -> ");
                    temp=temp.next;
                }

        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

    }

}
