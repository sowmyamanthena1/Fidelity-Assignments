package com.Assignment3;

import java.util.Scanner;

public class StrConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name");
        String lastName = sc.nextLine();
        System.out.println("Full name: " + firstName + " " + lastName);
        sc.close();
    }
}
