package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Facturas;
import com.tecnologica.ventacarros.irepository.IFacturasRepository;
import com.tecnologica.ventacarros.iservice.IFacturasService;

@Service
public class FacturasService implements IFacturasService{

	@Autowired
	private IFacturasRepository repository;
	
	@Override
	public List<Facturas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Facturas> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Facturas save(Facturas facturas) {
		return this.repository.save(facturas);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}
}
