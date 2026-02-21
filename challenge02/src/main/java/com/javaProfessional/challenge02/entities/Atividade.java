package com.javaProfessional.challenge02.entities;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    aliança
     @OneToMany(mappedBy = "categoria")
    private Set<Atividade> atividades = new HashSet<>();
     */

    @ManyToMany
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
            name = "tb_atividade_participante",
            joinColumns = @JoinColumn(name = "atividade_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    private Set<Participante> participantes = new HashSet<>();

    //
    @OneToMany(mappedBy = "atividade")
    private Set<Bloco> blocos = new HashSet<>();

    public Atividade() {}

    private String name;
    private String descricao;
    private double preco;

    //construtor ->
    public Atividade(Long id, Categoria categoria, String name, String descricao, double preco) {
        this.id = id;
        this.categoria = categoria;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
    }
}
