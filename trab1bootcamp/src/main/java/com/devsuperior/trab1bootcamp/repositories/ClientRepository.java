package com.devsuperior.trab1bootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.trab1bootcamp.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
