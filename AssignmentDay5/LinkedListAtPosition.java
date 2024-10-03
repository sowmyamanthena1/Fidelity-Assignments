package com.AssignmentDay5;

public class LinkedListAtPosition {
    Node head;
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int currentPosition = 1;

        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void print(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
