package com.sho.springbootmicroservicetransaction.manager;

import com.sho.springbootmicroservicetransaction.entitites.Transaction;

import java.util.List;

public interface ITransactionService {
    List<Transaction> findAllByUserId(Long userId);
    List<Transaction> getAllTransaction();
    Transaction saveTransaction(Transaction transaction);
    void deleteTransaction(Long transactionId);
}
