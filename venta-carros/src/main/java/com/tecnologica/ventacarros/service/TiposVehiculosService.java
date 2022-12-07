package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.TiposVehiculos;
import com.tecnologica.ventacarros.irepository.ITiposVehiculosRepository;
import com.tecnologica.ventacarros.iservice.ITiposVehiculosService;

@Service
public class TiposVehiculosService implements ITiposVehiculosService{

	@Autowired
	private ITiposVehiculosRepository repository;
	
	@Override
	public List<TiposVehiculos> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<TiposVehiculos> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public TiposVehiculos save(TiposVehiculos tiposVehiculos) {
		return this.repository.save(tiposVehiculos);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
