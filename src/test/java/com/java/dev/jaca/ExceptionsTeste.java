package com.java.dev.jaca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    void validarCenarioDeExcecao() {
        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("654321", 100);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferencia.transferir(contaOrigem, contaDestino, -1);
        });
    }
}