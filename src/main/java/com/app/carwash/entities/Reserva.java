package com.app.carwash.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "reserva")
public class Reserva {

    @Id
    @Column(name = "id_reserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;
    private LocalDate fecha;
    private int dias;
    @Column(columnDefinition = "decimal(12,2)")
    private double total;

    private int idCliente;
    private int idVehiculo;
}
