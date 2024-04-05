package com.app.carwash.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private int codigoCliente;
    private String nombre;
    private String apellido;
    @Column(name = "fechaIngreso", columnDefinition = "date")
    private LocalDate fechaIngreso;


}
