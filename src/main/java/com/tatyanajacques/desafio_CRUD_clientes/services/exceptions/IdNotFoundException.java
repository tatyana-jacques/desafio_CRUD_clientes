package com.tatyanajacques.desafio_CRUD_clientes.services.exceptions;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String message) {
        super(message);
    }
}
