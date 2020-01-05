package com.leandro.carta.domain;

import java.util.ArrayList;
import java.util.Random;

public class Maso {

    private ArrayList<Carta> cartas;
    private Random pickRandom;

    public Maso() {
        this.cartas = new ArrayList<>();
        agregarCartasDeOro();
        agregarCartaDeBasto();
        agregarCartasDeCopa();
        agregarCartasDeEspada();
    }

    public void agregarCartasDeOro() {
        for (int i = 1; i <= 12; i++) {
            this.cartas.add(new Carta(Palo.ORO, i));
        }
    }

    public void agregarCartaDeBasto() {
        for (int i = 1; i <= 12; i++) {
            this.cartas.add(new Carta(Palo.BASTO, i));
        }
    }

    public void agregarCartasDeEspada() {
        for (int i = 1; i <= 12; i++) {
            this.cartas.add(new Carta(Palo.ESPADA, i));
        }
    }

    public void agregarCartasDeCopa() {
        for (int i = 1; i <= 12; i++) {
            this.cartas.add(new Carta(Palo.COPA, i));
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}
