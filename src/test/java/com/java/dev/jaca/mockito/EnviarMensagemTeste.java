package com.java.dev.jaca.mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import com.java.dev.jaca.EnviarMensagem;
import com.java.dev.jaca.Mensagem;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Olá, essa é uma mensagem de teste.");
        enviarMensagem.adicionarMensagem(mensagem);
        verify(enviarMensagem).adicionarMensagem(mensagem);

        assertFalse(enviarMensagem.getMensagens().isEmpty());
    }
}
