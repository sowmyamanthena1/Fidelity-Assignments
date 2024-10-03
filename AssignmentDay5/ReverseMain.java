package com.AssignmentDay5;

public class ReverseMain {
    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.insertTail(1);
        list.insertTail(2);
        list.insertTail(3);
        list.insertTail(4);
        list.insertTail(5);
        System.out.println("Original List: ");
        list.print();
        list.reverseList();
        System.out.println("Reversed List: ");
        list.print();
    }
}
