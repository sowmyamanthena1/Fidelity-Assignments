package com.Assignment3;

import java.util.Scanner;

public class FindSquareCube {
    public static double FindSquare(double num){
        return num * num;
    }
    public static double findCube(double num){
        return num * num * num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = sc.nextDouble();
        double square = FindSquare(num);
        double cube = findCube(num);
        System.out.println("Square of " + num + " is " + square);
        System.out.println("Cube of " + num + " is " + cube);
        sc.close();
    }

}
