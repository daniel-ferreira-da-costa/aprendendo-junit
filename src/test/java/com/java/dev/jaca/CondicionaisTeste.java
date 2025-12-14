package com.java.dev.jaca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "jacare")
    void validarAlgoSomenteNoUsuarioJacare(){
        assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoExcetoNoUsuarioRoot(){
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(org.junit.jupiter.api.condition.OS.WINDOWS)
    @DisabledOnOs(org.junit.jupiter.api.condition.OS.MAC)
    void validarAlgoSomenteNoWindows(){
        assertEquals(10, 5 + 5);
    }
}