package com.app.carwash.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.carwash.entities.TipoVehiculo;
import com.app.carwash.repositories.TipoVehiculoRepository;
import com.app.carwash.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public List<TipoVehiculo> tiposVehiculos() {
        return (List<TipoVehiculo>) this.tipoVehiculoRepository.findAll();
    }

    @Override
    public TipoVehiculo eliminarTipoVehiculo(int id) {
        TipoVehiculo tipoVehiculo = this.tipoVehiculoRepository.findById(id).get();
        this.tipoVehiculoRepository.delete(tipoVehiculo);
        return tipoVehiculo;
    }

}
