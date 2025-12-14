package com.java.dev.jaca;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.conectar();
    }

    @BeforeEach
    void insereDadosDeTeste() {
        BancoDeDados.inserirDados(new Pessoa("Toto", LocalDate.of(1980, 1, 1)));
    }

    @AfterEach
    void removeDadosDeTeste() {
        BancoDeDados.removerDados(new Pessoa("Toto", LocalDate.of(1980, 1, 1)));
    }

    @Test
        void validarDadosDeRetorno() {
        Pessoa pessoa = new Pessoa("Toto", null);
        assertTrue(pessoa.getNome().equals("Toto"));
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.desconectar();
    }

}
