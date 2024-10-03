package com.AssignmentDay5;

import com.datastructure.demo.SingleLinkedList;

public class SingleLinkedListTail {
    Node head;
    public void insertTail(int data) { //method to insert node at tail at linked list
        Node newNode = new Node(data);//create new node
        if (head == null) { //if list is empty create, make new node the head
            head = newNode;
            //return;
        } else { // traverse to the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            } //link the last node to the new node
            current.next = newNode;
        }
    }
    public void print() {  //method to print linked list
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

}
