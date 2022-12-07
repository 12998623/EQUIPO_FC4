package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Inventarios;
import com.tecnologica.ventacarros.irepository.IInventariosRepository;
import com.tecnologica.ventacarros.iservice.IInventariosService;

@Service
public class InventariosService implements IInventariosService{

	@Autowired
	private IInventariosRepository repository;
	
	@Override
	public List<Inventarios> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Inventarios> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Inventarios save(Inventarios inventarios) {
		return this.repository.save(inventarios);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
