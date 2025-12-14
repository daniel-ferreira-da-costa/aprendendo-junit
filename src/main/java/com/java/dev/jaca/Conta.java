package com.java.dev.jaca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {

    private String numeroConta;
    private int saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    

}
