package com.professionalJava.challengea.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private Set<Atividade> atividades = new HashSet<>();

    public Categoria(){}

    public Categoria(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    //importei o lombok, por isso não coloquei get e set


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
