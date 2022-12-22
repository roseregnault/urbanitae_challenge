package com.example.demo3.dto;

import com.example.demo3.enums.TranStatus;
import com.example.demo3.enums.TranType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionDTO {

    private int Id;

    private BigDecimal TransactionAmount;

    private TranStatus TransactionStatus;

    private boolean isSuccesfull;

    private String TransactionDestinationAccount;

    private String TransactionSourceAccount;

    private String TransactionParticulars;

    private TranType TransactionType;

    private LocalDateTime TransactionDate;
}
