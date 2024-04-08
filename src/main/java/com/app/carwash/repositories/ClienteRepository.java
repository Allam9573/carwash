package com.app.carwash.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.carwash.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
