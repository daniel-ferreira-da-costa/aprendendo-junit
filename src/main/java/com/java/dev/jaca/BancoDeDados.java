package com.java.dev.jaca;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGUER = Logger.getLogger(BancoDeDados.class.getName());

    public static void conectar() {
        //fez algo
        LOGGUER.info("Conectando ao banco de dados...");
    }
    
    public static void desconectar() {
        //fez algo
        LOGGUER.info("Desconectando do banco de dados...");
    }

    public static void inserirDados(Pessoa pessoa) {
        //fez algo
        LOGGUER.info("Inserindo dados da pessoa no banco de dados...");
    }
    public static void removerDados(Pessoa pessoa) {
        //fez algo
        LOGGUER.info("Removendo dados da pessoa no banco de dados...");
    }
}
