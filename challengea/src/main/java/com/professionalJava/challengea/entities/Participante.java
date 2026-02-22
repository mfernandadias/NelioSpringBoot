package com.professionalJava.challengea.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "participantes")
    private Set<Atividade> atividades = new HashSet<>();

    public Participante() {
    }

    private String name;
    private String email;

    public Participante(Long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

}
