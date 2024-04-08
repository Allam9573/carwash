package com.app.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.carwash.entities.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {

}
