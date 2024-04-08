package com.app.carwash.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tipo_vehiculo")
public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_vehiculo")
    private int idTipoVehiculo;
    private String descripcion;
    @Column(columnDefinition = "decimal(10,2)", name = "precio_x_hora")
    private double precioXHora;

    @OneToMany(mappedBy = "tipoVehiculo")
    private List<Vehiculo> vehiculos;

}
