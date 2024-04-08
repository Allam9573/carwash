package com.app.carwash.services;

import java.util.List;

import com.app.carwash.entities.TipoCliente;

public interface TipoClienteService {

    public TipoCliente crearTipoCliente(String descripcion);

    public List<TipoCliente> tiposClientes();

}
