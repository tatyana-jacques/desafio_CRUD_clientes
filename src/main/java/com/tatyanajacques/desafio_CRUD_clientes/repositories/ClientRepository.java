package com.tatyanajacques.desafio_CRUD_clientes.repositories;

import com.tatyanajacques.desafio_CRUD_clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long> {
}
