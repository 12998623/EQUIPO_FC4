package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Personas;
import com.tecnologica.ventacarros.irepository.IPersonasRepository;
import com.tecnologica.ventacarros.iservice.IPersonasService;

@Service
public class PersonasService implements IPersonasService{

	@Autowired
	private IPersonasRepository repository;
	
	@Override
	public List<Personas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Personas> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Personas save(Personas personas) {
		return this.repository.save(personas);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
