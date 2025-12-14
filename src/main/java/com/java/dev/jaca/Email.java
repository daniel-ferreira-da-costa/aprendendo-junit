package com.java.dev.jaca;
import lombok.*;

@Getter
@Setter
public class Email {
    private String enderecoEmail;

    private String mensagem;

    private Formato formato;

    public Email(String enderecoEmail, String mensagem, Formato formato) {
        this.enderecoEmail = enderecoEmail;
        this.mensagem = mensagem;
        this.formato = formato;
    }
}
