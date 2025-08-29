package com.tatyanajacques.desafio_CRUD_clientes.services;

import com.tatyanajacques.desafio_CRUD_clientes.dto.ClientDTO;
import com.tatyanajacques.desafio_CRUD_clientes.entities.Client;
import com.tatyanajacques.desafio_CRUD_clientes.repositories.ClientRepository;
import com.tatyanajacques.desafio_CRUD_clientes.services.exceptions.IdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).orElseThrow(
                ()-> new IdNotFoundException("Cliente não encontrado."));
        return new ClientDTO(client);

    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }
}
