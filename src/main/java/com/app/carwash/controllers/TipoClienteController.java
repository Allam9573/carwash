package com.app.carwash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.carwash.entities.TipoCliente;
import com.app.carwash.services.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipo-cliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestParam String tipo) {
        return this.clienteServiceImpl.crearTipoCliente(tipo);

    }

    @GetMapping({ "", "/" })
    public List<TipoCliente> tiposClientes() {
        return this.clienteServiceImpl.tiposClientes();
    }

}
