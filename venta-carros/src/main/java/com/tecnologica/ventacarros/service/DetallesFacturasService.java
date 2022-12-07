package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.DetallesFacturas;
import com.tecnologica.ventacarros.irepository.IDetallesFacturasRepository;
import com.tecnologica.ventacarros.iservice.IDetallesFacturasService;

@Service
public class DetallesFacturasService implements IDetallesFacturasService{

	@Autowired
	private IDetallesFacturasRepository repository;
	
	@Override
	public List<DetallesFacturas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<DetallesFacturas> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public DetallesFacturas save(DetallesFacturas detallesFacturas) {
		return this.repository.save(detallesFacturas);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}
}
