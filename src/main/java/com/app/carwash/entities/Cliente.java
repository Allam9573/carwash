package com.app.carwash.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "codigo_cliente")
    private int codigoCliente;
    private String nombre;
    private String apellido;
    @Column(name = "fecha_ingreso", columnDefinition = "date")
    private LocalDate fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "id_tipo_cliente", referencedColumnName = "id_tipo_cliente")
    private TipoCliente tipoCliente;

}
