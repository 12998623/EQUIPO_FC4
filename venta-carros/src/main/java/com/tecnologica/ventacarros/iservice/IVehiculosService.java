package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Vehiculos;

public interface IVehiculosService {

public List<Vehiculos> all();
	
	public Optional<Vehiculos> findById(String id);
	
	public Vehiculos save(Vehiculos vehiculos);
	
	public void delete(String id);
}
