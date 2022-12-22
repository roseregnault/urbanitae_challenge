package com.example.demo3.service;

import com.example.demo3.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    List<AccountDTO> getAllAccounts (String id);

    AccountDTO GetById(int id);

    AccountDTO GetByAccountNumber(String AccountNumer);
}
