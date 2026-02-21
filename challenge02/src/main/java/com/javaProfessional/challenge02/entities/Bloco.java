package com.javaProfessional.challenge02.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Instant inicio;
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;


    public Bloco(Long id, Instant inicio, Instant fim, Atividade atividade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    }




}
