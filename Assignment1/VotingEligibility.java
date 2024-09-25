package com.Assignment1;
import java.util.Scanner;

public class VotingEligibility {
    public static boolean isEligibleToVote(int age) {
        return  age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(isEligibleToVote(age)) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
