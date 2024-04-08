package com.app.carwash.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.carwash.entities.TipoCliente;
import com.app.carwash.repositories.TipoClienteRepository;
import com.app.carwash.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository clienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente nuevoTipoCliente = new TipoCliente();
        nuevoTipoCliente.setDescripcion(descripcion);
        return this.clienteRepository.save(nuevoTipoCliente);
    }

    @Override
    public List<TipoCliente> tiposClientes() {
        return (List<TipoCliente>) this.clienteRepository.findAll();
    }

}
