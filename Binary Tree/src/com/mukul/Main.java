package com.mukul;

import java.util.Scanner;

public class Main {
    static void main() {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        //tree.display();
//        tree.preetyDisplay();

//        BinarySearchTree tree = new BinarySearchTree();
//        int[] nums = {5,2,1,4,6,9,8,3,18};
//        tree.populate(nums);
//        tree.display();

//        AVL tree = new AVL();
//
//        for (int i=0;i<10;i++){
//            tree.insert(i);
//        }
//        tree.insert(10);
//        tree.insert(11);
//        tree.display();

            int[] arr ={3,8,6,7,-2,-8,4,9};
            Segment_Tree tree=new Segment_Tree(arr);
           // tree.display();

        System.out.println(tree.query(1,6));


    }
}
