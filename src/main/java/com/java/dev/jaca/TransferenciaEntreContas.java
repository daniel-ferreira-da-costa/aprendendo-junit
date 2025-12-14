package com.java.dev.jaca;

public class TransferenciaEntreContas {

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("O valor da transferência deve ser maior que zero.");
        }
    }

}
