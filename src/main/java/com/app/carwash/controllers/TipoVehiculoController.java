package com.app.carwash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.carwash.entities.TipoVehiculo;
import com.app.carwash.services.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipo-vehiculo")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @GetMapping({ "", "/" })
    public List<TipoVehiculo> tiposVehiculos() {
        return this.tipoVehiculoServiceImpl.tiposVehiculos();
    }

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }

    @GetMapping("/eliminar")
    public TipoVehiculo eliminarTipoVehiculo(@RequestParam int tipo) {
        return this.tipoVehiculoServiceImpl.eliminarTipoVehiculo(tipo);
    }

}
