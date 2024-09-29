package com.Assignment3;

public class Account {
    private int id;
    private String accountType;
    private double balance;
    public Account() {}
    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean Withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }
    public String getDetails(){
        return "Account id: " + id + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}
