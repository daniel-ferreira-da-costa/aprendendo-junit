package com.java.dev.jaca;

import lombok.*;

@Getter
@Setter
public class CadastrarPessoa {
    private ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String dataNascimento, String documento, String cep) {
        Endereco endereco = apiDosCorreios.consultarEndereco(cep);
        return new Pessoa(nome, java.time.LocalDate.parse(dataNascimento), documento, endereco);
    }
}
