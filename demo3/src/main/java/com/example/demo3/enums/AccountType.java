package com.example.demo3.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum AccountType {
    ;


   private final String value;

    AccountType(String value) { this.value = value; }

    public String getValue() {
        return this.value;
    }

    public static final Optional<AccountType> obtenerAccountType(String code){

        return Stream.of(AccountType.values()).filter(at -> at.getValue().equals(code)).findFirst();
    }
}
