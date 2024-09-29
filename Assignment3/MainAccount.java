package com.Assignment3;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account type: ");
        String type = sc.nextLine();
        System.out.println("Enter account balance: ");
        double balance = sc.nextDouble();
        Account account = new Account(id, type, balance);
        System.out.println(account.getDetails());
        System.out.println("Enter amount to witdraw");
        double amountToWithdraw = sc.nextDouble();
        if(account.Withdraw(amountToWithdraw)) {
            System.out.println("New Balance:" + account.getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }
        sc.close();
    }
}
