package com.mukul;

public class Segment_Tree {

    private class Node {
        int data;
        Node left;
        Node right;
        int startinterval;
        int endinterval;

        public Node(int startinterval, int endinterval) {
            this.startinterval = startinterval;
            this.endinterval = endinterval;
        }
    }

    private Node root;

    public Segment_Tree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str += "interval=[" + node.left.startinterval + "-" + node.left.endinterval + "] data=" + node.left.data + " => ";
        } else {
            str += "No left child => ";
        }

        str += "interval=[" + node.startinterval + "-" + node.endinterval + "] data=" + node.data + " <= ";

        if (node.right != null) {
            str += "interval=[" + node.right.startinterval + "-" + node.right.endinterval + "] data=" + node.right.data;
        } else {
            str += "No right child";
        }

        System.out.println(str);

        if (node.left != null) display(node.left);
        if (node.right != null) display(node.right);
    }

    // QUERY
    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        // completely inside
        if (node.startinterval >= qsi && node.endinterval <= qei) {
            return node.data;
        }
        // completely outside
        else if (node.endinterval < qsi || node.startinterval > qei) {
            return 0;
        }
        // partial overlap
        else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }

    // UPDATE
    public void update(int index, int value) {
        update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startinterval && index <= node.endinterval) {
            // leaf node
            if (node.startinterval == node.endinterval) {
                node.data = value;
                return node.data;
            }

            int leftAns = update(node.left, index, value);
            int rightAns = update(node.right, index, value);

            node.data = leftAns + rightAns;
        }

        return node.data;
    }
}