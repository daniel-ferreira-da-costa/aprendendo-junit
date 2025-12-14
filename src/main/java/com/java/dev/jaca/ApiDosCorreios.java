package com.java.dev.jaca;

public class ApiDosCorreios {
    public Endereco consultarEndereco(String cep) {
        // Simulação de consulta ao serviço dos Correios
        return new Endereco("Rua Exemplo", "Bairro Exemplo", "Cidade Exemplo", "EX", cep);
    }
}
