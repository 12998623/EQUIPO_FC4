package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Vehiculos;
import com.tecnologica.ventacarros.irepository.IVehiculosRepository;
import com.tecnologica.ventacarros.iservice.IVehiculosService;

@Service
public class VehiculosService implements IVehiculosService{

	@Autowired
	private IVehiculosRepository repository;
	
	@Override
	public List<Vehiculos> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Vehiculos> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Vehiculos save(Vehiculos vehiculos) {
		return this.repository.save(vehiculos);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
