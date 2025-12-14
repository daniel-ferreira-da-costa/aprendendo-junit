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

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public void pagaBoleto(int valor) {
       validaSaldo(valor);
       debita(valor);
       enviaCreditoParaEmissor(valor);
    }
    
    public void validaSaldo(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do boleto deve ser maior que zero.");
        }
        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para pagar o boleto.");
        }
    }

    public void debita(int valor) {
        this.saldo -= valor;
    }

    public void enviaCreditoParaEmissor(int valor) {
        //envia crédito para o emissor do boleto
    }
}
