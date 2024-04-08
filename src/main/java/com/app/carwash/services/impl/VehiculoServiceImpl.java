package com.app.carwash.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.carwash.entities.Vehiculo;
import com.app.carwash.repositories.VehiculoRepository;
import com.app.carwash.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> vehiculos() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }

    @Override
    public Optional<Vehiculo> buscarVehiculo(int id) {
        return this.vehiculoRepository.findById(id);
    }

}
