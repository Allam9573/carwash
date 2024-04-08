package com.app.carwash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.carwash.entities.Vehiculo;
import com.app.carwash.services.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @GetMapping({ "", "/" })
    public List<Vehiculo> vehiculos() {
        return this.vehiculoServiceImpl.vehiculos();
    }

    @PostMapping("/crear")
    public Vehiculo crearvehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

}
