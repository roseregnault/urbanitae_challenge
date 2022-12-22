package com.example.demo3.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
@ToString
public class AccountEntityId {

    private static final long serialVersionUID = -1L;

    @Column(name = "URBANITAE_ID_ACCOUNT")
    private int idAccount;

    @Column(name = "URBANITAE_COD_ACCOUNT")
    private int codCuenta;


}
