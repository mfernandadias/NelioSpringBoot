package com.javaProfessional.challenge02.repository;

import com.javaProfessional.challenge02.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
