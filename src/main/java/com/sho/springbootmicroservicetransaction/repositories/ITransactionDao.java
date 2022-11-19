package com.sho.springbootmicroservicetransaction.repositories;

import com.sho.springbootmicroservicetransaction.entitites.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionDao extends JpaRepository<Transaction,Long> {

    List<Transaction> findAllByUserId(Long userId);
}
