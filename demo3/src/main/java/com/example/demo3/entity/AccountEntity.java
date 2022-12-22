package com.example.demo3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACCOUNT")
@Getter
@Setter
public class AccountEntity {

    private AccountEntityId id;

    private LocalDateTime DateCreated;

    private LocalDateTime DateLastCreated;

    private String accountName;

}
