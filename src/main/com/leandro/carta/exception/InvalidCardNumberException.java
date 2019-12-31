package com.leandro.carta.exception;

public class InvalidCardNumberException extends RuntimeException{

    public InvalidCardNumberException(String messege){
        super(messege);
    }
}
