package com.java.dev.jaca;

import java.util.UUID;

import lombok.*;

@Getter
@Setter
public class Mensagem {

    private String id;

    private String mensagem;

    public Mensagem(final String mensagem) {
        this.id = UUID.randomUUID().toString();
        this.mensagem = mensagem;
    }
}