package com.Assignment2;
import java.util.Scanner;
class AccountDetails {
    private int accno;
    private String name;
    private Double balance;
    public AccountDetails(int accno, String name, Double initalbalance) {
        this.accno = accno;
        this.name = name;
        this.balance = initalbalance;

    }
    public void Deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited "+ amount);
        }
        else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount){
        if (amount>0 && balance<=amount){
            balance-= amount;
            System.out.println("Withdrawn "+amount);
        }
        else if(amount> balance){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println("withdrawal amount must be positive");
        }
    }
    public void checkBalance() {
        System.out.printf("Current Balance: Rs. %.2f%n", balance);
    }
    public void DisplayAccountdetails(){
        {
            System.out.println("Account Number "+accno);
            System.out.println("Account Holder Name "+name);
            System.out.println("Current Balance "+balance);
        }
    }
}
public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AccountDetails account = new AccountDetails(1001, "ram", 1920.00);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Check Balance");
            System.out.println("4: Display Account Details");
            System.out.println("5: Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.Deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.DisplayAccountdetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}