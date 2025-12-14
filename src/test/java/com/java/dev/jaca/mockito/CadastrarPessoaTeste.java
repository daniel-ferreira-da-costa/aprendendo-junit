package com.java.dev.jaca.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.dev.jaca.ApiDosCorreios;
import com.java.dev.jaca.CadastrarPessoa;
import com.java.dev.jaca.Endereco;
import com.java.dev.jaca.Pessoa;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;


    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        Endereco endereco = new Endereco("NC10", "vale do sol", "palmas", "to", "77000000");
        Mockito.when(apiDosCorreios.consultarEndereco("12345-678")).thenReturn(endereco);
        Pessoa joao = cadastrarPessoa.cadastrarPessoa("João Silva", "1990-05-15", "123.456.789-00", "12345-678");
        
        assertEquals("joão silva", joao.getNome().toLowerCase());
        assertEquals("123.456.789-00", joao.getDocumento());
        assertEquals(endereco, joao.getEndereco());
    }

}
