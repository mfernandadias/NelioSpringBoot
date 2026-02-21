package com.javaProfessional.challenge02.repository;

import com.javaProfessional.challenge02.entities.Participante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}
