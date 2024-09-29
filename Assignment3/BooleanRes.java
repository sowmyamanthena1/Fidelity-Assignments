package com.Assignment3;

import java.util.Scanner;

public class BooleanRes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value for y: ");
        int y = sc.nextInt();
        boolean result = x<y;
        System.out.println("The result of whether x is less than y is " + result);
        sc.close();
    }
}
