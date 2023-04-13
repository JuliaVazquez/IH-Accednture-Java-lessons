package com.ironhack.w1.d4.checkingInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentList implements ITransactionList{
//  ATTRIBUTES OR PROPERTIES
    private List<Transaction> transactionsList = new ArrayList<>();

//  ABSTRACT METHODS

    @Override
    public Transaction getLastTransaction() {
        return transactionsList.get(transactionsList.size()-1);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactionsList.add(transaction);
    }

    @Override
    public Transaction getTransactionByDate(LocalDate date) {
        for(Transaction transaction : transactionsList) {
            if(transaction.getDate().equals(date)){
                return transaction;
            }
        }
        return null;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        List<Transaction> transactionsList1 = transactionsList;
        return transactionsList1;
    }
}
