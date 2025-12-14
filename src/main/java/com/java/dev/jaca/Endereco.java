package com.java.dev.jaca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(String logradouro, String bairro, String cidade, String uf, String cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
}
