package com.leandro.carta.domain;

import java.util.ArrayList;

public class Maso {

    private ArrayList<Carta> cartas;

    public Maso() {
        this.cartas = new ArrayList<>(12);
        for (int i = 1; i <= 12; i++) {
            this.cartas.add( new Carta(Palo.ORO, i));
        }
    }

    public ArrayList<Carta> getCartas() {

        return cartas;
    }

}
