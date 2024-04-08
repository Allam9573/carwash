package com.app.carwash.services;

import java.util.List;
import java.util.Optional;

import com.app.carwash.entities.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> clientes();

    public Optional<Cliente> buscarCliente(int id);
}
