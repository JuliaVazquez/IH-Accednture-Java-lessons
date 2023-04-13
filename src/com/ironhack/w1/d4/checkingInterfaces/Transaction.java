package com.ironhack.w1.d4.checkingInterfaces;

import java.time.LocalDate;

public class Transaction {
// ATTRIBUTES OR PROPERTIES
    private String sellerAccountNumber;
    private String buyerAccountNumber;
    private double amount;
    private LocalDate date;

//  CONSTRUCTORS

    public Transaction(String sellerAccountNumber, String buyerAccountNumber, double amount, LocalDate date) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

//  GETTERS

    public String getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public String getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

//  SETTERS

    public void setSellerAccountNumber(String sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public void setBuyerAccountNumber(String buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
