package com.app.carwash.services;

import java.util.List;
import java.util.Optional;

import com.app.carwash.entities.Vehiculo;

public interface VehiculoService {

    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> vehiculos();

    public Optional<Vehiculo> buscarVehiculo(int id);

}
