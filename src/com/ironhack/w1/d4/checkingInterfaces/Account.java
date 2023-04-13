package com.ironhack.w1.d4.checkingInterfaces;

public class Account {
//  ATTRIBUTES OR PROPERTIES
    private String name;
    private String address;
    private String accountNumber;
    private double balance;

//  CONSTRUCTORS

    public Account(String name, String address, String accountNumber, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//  GETTERS

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

//  SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
