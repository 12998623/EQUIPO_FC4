package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.TiposVehiculos;

public interface ITiposVehiculosService {

public List<TiposVehiculos> all();
	
	public Optional<TiposVehiculos> findById(String id);
	
	public TiposVehiculos save(TiposVehiculos tiposVehiculos);
	
	public void delete(String id);
}
