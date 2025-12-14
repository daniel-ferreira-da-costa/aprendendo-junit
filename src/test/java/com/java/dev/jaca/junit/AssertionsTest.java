package com.java.dev.jaca.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.java.dev.jaca.Pessoa;

public class AssertionsTest {
    @Test
    void validarLancamentosDiferentes() {
        int[] primeirosLancamentos = {100, 200, 300, 400, 500, 600};
        int[] segundosLancamentos = {100, 5, 2, 3, 10, 16};

        assertNotEquals(primeirosLancamentos, segundosLancamentos);
    }

    @Test
    void validarLancamentosIguais() {
        int[] primeirosLancamentos = {100, 200, 300, 400, 500, 600};
        int[] segundosLancamentos = {100, 200, 300, 400, 500, 600};

        assertArrayEquals(primeirosLancamentos, segundosLancamentos);
    }

    @Test
    void validarSeObjEstaNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Dre", LocalDate.of(1990, 5, 20));
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        Integer numeroInteiro = 10;
        Long numeroLongo = 10L;
        assertNotEquals(numeroInteiro, numeroLongo);

        Integer outroNumeroInteiro = 10;
        assertEquals(numeroInteiro, outroNumeroInteiro);
    }
}