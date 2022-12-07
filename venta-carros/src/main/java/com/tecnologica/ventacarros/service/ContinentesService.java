package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Continentes;
import com.tecnologica.ventacarros.irepository.IContinentesRepository;
import com.tecnologica.ventacarros.iservice.IContinentesService;

@Service
public class ContinentesService implements IContinentesService{

	@Autowired
	private IContinentesRepository repository;
	
	@Override
	public List<Continentes> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Continentes> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Continentes save(Continentes continentes) {
		return this.repository.save(continentes);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}