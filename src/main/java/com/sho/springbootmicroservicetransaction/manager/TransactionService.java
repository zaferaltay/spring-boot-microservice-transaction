package com.sho.springbootmicroservicetransaction.manager;


import com.sho.springbootmicroservicetransaction.entitites.Transaction;
import com.sho.springbootmicroservicetransaction.repositories.ITransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    ITransactionDao transactionDao;

    @Override
    public List<Transaction> findAllByUserId(Long userId){
        return transactionDao.findAllByUserId(userId);
    }
    @Override
    public List<Transaction> getAllTransaction(){
        return  transactionDao.findAll();
    }
    @Override
    public Transaction saveTransaction(Transaction transaction){
        transaction.setCreation_time(LocalDateTime.now());
        return transactionDao.save(transaction);
    }
    @Override
    public void deleteTransaction(Long transactionId){
        transactionDao.deleteById(transactionId);
    }

}
