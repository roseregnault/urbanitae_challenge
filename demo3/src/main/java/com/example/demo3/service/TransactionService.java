package com.example.demo3.service;


import com.example.demo3.dto.TransactionDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface TransactionService {

     void CreateNewTransaction(TransactionDTO transactionDTO);

     void FindTransactionByDate(LocalDateTime date);

     void MakeDeposit(String AccountNumber, BigDecimal Amount, String TransactionPin);

     void MakeWithDrawal(String AccountNumber, BigDecimal Amount, String TransactionPin);

     void MAkeFundsTransfer(String FromAccount, String toAccount, BigDecimal Amount, String TransactionPin);
}
