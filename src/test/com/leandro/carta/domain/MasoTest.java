package com.leandro.carta.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MasoTest {

    @Test
    void cartasNotNull() {

        Maso maso = new Maso();

        assertNotEquals(12, maso.getCartas());

    }

    @Test
    void sizeOfTheListIs12() {

        Maso maso = new Maso();

        assertEquals(12, maso.getCartas().size());

    }
}