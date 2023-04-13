package com.ironhack.w1.d4.checkingInterfaces;

import java.time.LocalDate;
import java.util.List;

public interface ITransactionList {
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(LocalDate date);
    List<Transaction> getAllTransactions();
}
