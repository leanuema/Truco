package com.leandro.carta.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartaTest {

    @Test
    void getNumero() {

        Carta carta = new Carta(Palo.ORO, 12);

        assertEquals(12, carta.getNumero());
    }

    @Test
    void setNumeroOk() {

        Carta carta = new Carta(Palo.ORO, 12);
        carta.setNumero(9);
        assertEquals(9, carta.getNumero());
    }

    @Test
    void setNumeroError() {

        Carta carta = new Carta(Palo.COPA, 12);
        carta.setNumero(15);
        assertEquals(12, carta.getNumero());
    }
}