package com.app.carwash.services;

import java.util.List;

import com.app.carwash.entities.TipoVehiculo;

public interface TipoVehiculoService {

    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);

    public List<TipoVehiculo> tiposVehiculos();
    public TipoVehiculo eliminarTipoVehiculo(int id);

}
