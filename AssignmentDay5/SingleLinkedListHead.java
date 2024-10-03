package com.AssignmentDay5;

public class SingleLinkedListHead {
    Node head;
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // new node head to the current head
        head = newNode; // update head to the new node
    }
    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
