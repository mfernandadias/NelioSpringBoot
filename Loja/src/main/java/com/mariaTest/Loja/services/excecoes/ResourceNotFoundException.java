package com.mariaTest.Loja.services.excecoes;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super (message);
    }
}
