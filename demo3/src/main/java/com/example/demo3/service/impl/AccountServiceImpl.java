package com.example.demo3.service.impl;

import com.example.demo3.dto.AccountDTO;
import com.example.demo3.entity.AccountEntity;
import com.example.demo3.repository.AccountDAO;
import com.example.demo3.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountDAO accountDAO;


    @Override
    public List<AccountDTO> getAllAccounts(String id) {
        return accountDAO.findAll()
                .stream().map(this::getAccount).collect(Collectors.toList());
    }

    private AccountDTO getAccount(AccountEntity entity){

        AccountDTO account = new AccountDTO();
        account.setId(entity.getId().getIdAccount());
        account.setDateLastCreated(entity.getDateLastCreated());

        return account;
    }



    @Override
    public AccountDTO GetById(int id) {
        return null;
    }

    @Override
    public AccountDTO GetByAccountNumber(String AccountNumer) {
        return null;
    }
}
