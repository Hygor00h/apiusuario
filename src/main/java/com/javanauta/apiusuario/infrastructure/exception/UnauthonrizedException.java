package com.javanauta.apiusuario.infrastructure.exception;

public class UnauthonrizedException extends RuntimeException{

    public UnauthonrizedException(String mensagem){
        super(mensagem);
    }

    public UnauthonrizedException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}