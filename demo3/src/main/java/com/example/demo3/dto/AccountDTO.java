package com.example.demo3.dto;

import com.example.demo3.enums.AccountType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class AccountDTO {

    public int Id;

    private String FirstName;

    private String LastName;

    private String accountName;

    private String phoneNumber;

    private String email;

    private DecimalFormat currentAccoountBalance;

    private AccountType accountType;

    private String AccountnumberGenerated;

    private LocalDateTime DateCreated;

    private LocalDateTime DateLastCreated;
}
