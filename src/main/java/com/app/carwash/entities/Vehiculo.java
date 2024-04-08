package com.app.carwash.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    private int idVehiculo;
    private String marca;
    private int anio;
    @Column(columnDefinition = "tinyint")
    private boolean disponible;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tipo_vehiculo", referencedColumnName = "id_tipo_vehiculo")
    private TipoVehiculo tipoVehiculo;

}
