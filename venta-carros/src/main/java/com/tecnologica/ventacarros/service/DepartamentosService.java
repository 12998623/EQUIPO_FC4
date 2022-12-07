package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Departamentos;
import com.tecnologica.ventacarros.irepository.IDepartamentosRepository;
import com.tecnologica.ventacarros.iservice.IDepartamentosService;

@Service
public class DepartamentosService implements IDepartamentosService{

	@Autowired
	private IDepartamentosRepository repository;
	
	@Override
	public List<Departamentos> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Departamentos> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Departamentos save(Departamentos departamentos) {
		return this.repository.save(departamentos);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
