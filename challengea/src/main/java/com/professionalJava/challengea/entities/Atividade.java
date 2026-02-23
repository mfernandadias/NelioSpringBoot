package com.professionalJava.challengea.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String descricao;
    private Double preco;

    // 🔹 Muitos para muitos (lado inverso)
    @ManyToMany(mappedBy = "atividades")
    private Set<Participante> participantes = new HashSet<>();

    // 🔹 Muitos para um (Categoria)
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // 🔹 Um para muitos (Bloco)
    @OneToMany(mappedBy = "atividade")
    private List<Bloco> blocos = new ArrayList<>();

    public Atividade(Long id, Double preco, String descricao, String name) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
