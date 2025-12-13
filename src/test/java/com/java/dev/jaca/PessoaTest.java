package com.java.dev.jaca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    public void testGetIdade() {
        Pessoa pessoa = new Pessoa("Dre", LocalDate.of(1998, 1, 19));
        int idadeEsperada = LocalDate.now().getYear() - 1998;
        assertEquals(idadeEsperada, pessoa.getIdade());
    }

    @Test
    public void testMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Rique", LocalDate.of(2023, 1, 1));
        assertFalse(pessoa.maiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Toto", LocalDate.of(2022, 1, 1));
        assertFalse(pessoa2.maiorDeIdade());

        Pessoa pessoa3 = new Pessoa("Jaca", LocalDate.of(2000, 9, 15));
        assertTrue(pessoa3.maiorDeIdade());
    }
}