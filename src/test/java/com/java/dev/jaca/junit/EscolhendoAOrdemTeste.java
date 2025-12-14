package com.java.dev.jaca.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {
    @Order(2)
    @Test
    void validaFluxoA(){
        assertTrue(true);
    }
    
    @Order(3)
    @Test
    void validaFluxoB(){
        assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoC(){
        assertTrue(true);
    }
}
