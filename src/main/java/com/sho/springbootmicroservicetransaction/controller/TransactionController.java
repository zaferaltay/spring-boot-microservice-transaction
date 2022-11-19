package com.sho.springbootmicroservicetransaction.controller;


import com.sho.springbootmicroservicetransaction.entitites.Transaction;
import com.sho.springbootmicroservicetransaction.manager.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    @Autowired
    private ITransactionService transactionService;


    @GetMapping("{userId}")
    public ResponseEntity<?> getAllTransactionsOfUser(@PathVariable Long userId){

        return  new ResponseEntity<>(transactionService.findAllByUserId(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction){
        return new ResponseEntity<>(transactionService.saveTransaction(transaction),HttpStatus.CREATED);
    }

    @DeleteMapping("{deleteId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long deleteId){
        transactionService.deleteTransaction(deleteId);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
