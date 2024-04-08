package com.app.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.carwash.entities.Vehiculo;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo, Integer> {

}
