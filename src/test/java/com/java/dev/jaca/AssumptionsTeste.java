package com.java.dev.jaca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class AssumptionsTeste {
    @Test
    void validarAlgoSomenteNoUsuarioJacare() {
        Assumptions.assumeTrue("jacare".equals(System.getenv("USER")));
        assertEquals(10, 5 + 5);
    }
}
