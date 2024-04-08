package com.app.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.carwash.entities.TipoCliente;

@Repository
public interface TipoClienteRepository extends CrudRepository<TipoCliente, Integer> {

}
