package com.mariaTest.Loja.repositories;

import com.mariaTest.Loja.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {


}
