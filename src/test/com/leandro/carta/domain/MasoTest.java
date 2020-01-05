package com.leandro.carta.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MasoTest {

    @Test
    void cardsNotNull() {
        Maso maso = new Maso();
        assertNotEquals(12, maso.getCartas());
    }

    @Test
    void sizeOfTheListIs12() {
        Maso maso = new Maso();
        assertEquals(48, maso.getCartas().size());
    }

    @Test
    void giveCardsOfMaso() {
        Maso maso = new Maso();
        maso.getCartas();
        assertEquals(48, maso.getCartas());
    }

    @Test
    void getRandomCardOfMaso() {
        Maso maso = new Maso();
        maso.getARandomCard();
    }
}