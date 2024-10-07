package com.Assessment3;

public class LinkedList {
    Node head;
    public void add(int data){ //Method to add node at end of list
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removeAt(int index){ //Method to remove node at specific index
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(index == 0){
            head = head.next; // Remove head
            return;
        }
        Node current = head;
        Node previous = null;
        int currentIndex = 0;
        while(current != null && currentIndex < index){
            previous = current;
            current = current.next;
            currentIndex++;
        }
        if(current == null){
            System.out.println("Index out of bounds. ");
            return;
        }
        previous.next = current.next;
    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }
}
