package com.leandro.carta.domain;

import com.leandro.carta.exception.InvalidCardNumberException;

public class Carta {

    private int numero;
    private Palo palo;

    public Carta(Palo palo, int numero){
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero<13) {
            this.numero = numero;
        }
        else {
            throw new InvalidCardNumberException("Error");
        }
    }
}
