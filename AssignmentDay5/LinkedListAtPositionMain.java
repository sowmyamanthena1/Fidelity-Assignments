package com.AssignmentDay5;

public class LinkedListAtPositionMain {
    public static void main(String[] args) {
        LinkedListAtPosition list = new LinkedListAtPosition();
        list.insertAtTail(16);
        list.insertAtTail(13);
        list.insertAtTail(7);
        list.print();
        list.insertAtPosition(3,1);
        list.print();
    }
}
