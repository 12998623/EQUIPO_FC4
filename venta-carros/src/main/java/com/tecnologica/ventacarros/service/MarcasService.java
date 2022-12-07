package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Marcas;
import com.tecnologica.ventacarros.irepository.IMarcasRepository;
import com.tecnologica.ventacarros.iservice.IMarcasService;

@Service
public class MarcasService implements IMarcasService{

	@Autowired
	private IMarcasRepository repository;
	
	@Override
	public List<Marcas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Marcas> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Marcas save(Marcas marcas) {
		return this.repository.save(marcas);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
