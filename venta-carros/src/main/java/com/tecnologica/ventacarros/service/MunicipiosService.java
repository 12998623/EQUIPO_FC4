package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Municipios;
import com.tecnologica.ventacarros.irepository.IMunicipiosRepository;
import com.tecnologica.ventacarros.iservice.IMunicipiosService;

@Service
public class MunicipiosService implements IMunicipiosService{

	@Autowired
	private IMunicipiosRepository repository;
	
	@Override
	public List<Municipios> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Municipios> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Municipios save(Municipios municipios) {
		return this.repository.save(municipios);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
