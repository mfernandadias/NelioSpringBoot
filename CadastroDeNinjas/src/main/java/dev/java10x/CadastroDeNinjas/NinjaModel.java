package dev.java10x.CadastroDeNinjas;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@
public class NinjaModel {

    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }


}
