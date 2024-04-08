package com.app.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.carwash.entities.TipoVehiculo;

@Repository
public interface TipoVehiculoRepository extends CrudRepository<TipoVehiculo, Integer> {

}
