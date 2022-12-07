package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Paises;
import com.tecnologica.ventacarros.irepository.IPaisesRepository;
import com.tecnologica.ventacarros.iservice.IPaisesService;

@Service
public class PaisesService implements IPaisesService{

	@Autowired
	private IPaisesRepository repository;
	
	@Override
	public List<Paises> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Paises> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Paises save(Paises paises) {
		return this.repository.save(paises);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
