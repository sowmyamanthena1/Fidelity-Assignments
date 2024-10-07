package com.Assessment3;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter 4 numbers to add to the linked list:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = sc.nextInt();
            list.add(number);
        }

        // Printing the linked list
        System.out.println("\nOriginal Linked List:");
        list.printList();

        // Removing an element at a specific index
        System.out.print("Enter the index of the element to remove (0-3): ");
        int indexToRemove = sc.nextInt();

        list.removeAt(indexToRemove);

        // Printing the linked list after removal
        System.out.println("\nLinked List after removal:");
        list.printList();
        sc.close();
    }
}
