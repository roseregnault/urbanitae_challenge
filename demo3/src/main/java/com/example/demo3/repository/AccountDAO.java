package com.example.demo3.repository;

import com.example.demo3.entity.AccountEntity;
import com.example.demo3.entity.AccountEntityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface AccountDAO extends JpaRepository<AccountEntity, AccountEntityId> {

    @Override
    List<AccountEntity> findAll();

}
