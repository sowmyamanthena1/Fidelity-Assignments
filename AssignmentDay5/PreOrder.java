package com.AssignmentDay5;

public class PreOrder {
    public void preOrder(Node1 root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        PreOrder tree = new PreOrder();
        Node1 root = new Node1(1);
        root.right = new Node1(2);
        root.right.right = new Node1(5);
        root.right.right.left = new Node1(3);
        root.right.right.left.right = new Node1(4);
        root.right.right.right = new Node1(6);

        tree.preOrder(root);
    }
}
