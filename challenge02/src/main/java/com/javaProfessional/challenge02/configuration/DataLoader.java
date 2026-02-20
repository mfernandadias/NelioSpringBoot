package com.javaProfessional.challenge02.configuration;

import com.javaProfessional.challenge02.repository.AtividadeRepository;
import com.javaProfessional.challenge02.repository.BlocoRepository;
import com.javaProfessional.challenge02.repository.CategoriaRepository;
import com.javaProfessional.challenge02.repository.ParticipanteRepository;
import entities.Atividade;
import entities.Categoria;
import entities.Participante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader  implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Autowired
    private BlocoRepository blocoRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria(null, "Curso");
        Categoria c2 = new Categoria(null, "Oficina");

        categoriaRepository.saveAll(Arrays.asList(c1, c2));

        Atividade a1 = new Atividade(null, "Curso de HTML Aprenda HTML de forma prática", 80.0, c1);

        Atividade a2 = new Atividade(null, "Oficina de Github Controle versões de seus projetos", 50.0, c2);

        atividadeRepository.saveAll(Arrays.asList(a1, a2));

        Participante p1 = new Participante(null, "José Silva", "jose@gmail.com");
        Participante p2 = new Participante(null, "Tiago Faria", "tiago@gmail.com");
        Participante p3 = new Participante(null, "Maria do Rosário", "maria@gmail.com");
        Participante p4 = new Participante(null, "Teresa Silva", "teresa@gmail.com");

        participanteRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

        a1.getParticipantes().add(p1);
        a1.getParticipantes().add(p2);
        a1.getParticipantes().add(p3);

        a2.getParticipantes().add(p1);
        a2.getParticipantes().add(p3);
        a2.getParticipantes().add(p4);





    }
