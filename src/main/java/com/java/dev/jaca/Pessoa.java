package com.java.dev.jaca;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String documento;
    private Endereco endereco;


    public Pessoa(String nome, LocalDate dataNascimento, String documento, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.endereco = endereco;
    }

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public int getIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public boolean maiorDeIdade() {
        return getIdade() >= 18;
    }
}