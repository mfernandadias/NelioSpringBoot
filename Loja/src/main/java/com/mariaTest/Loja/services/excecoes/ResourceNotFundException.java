package com.mariaTest.Loja.services.excecoes;

public class ResourceNotFundException extends RuntimeException {
    public ResourceNotFundException(String msg){
        super(msg);
    }
}
