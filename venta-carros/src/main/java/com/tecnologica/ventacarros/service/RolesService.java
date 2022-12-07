package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Roles;
import com.tecnologica.ventacarros.irepository.IRolesRepository;
import com.tecnologica.ventacarros.iservice.IRolesService;

@Service
public class RolesService implements IRolesService{

	@Autowired
	private IRolesRepository repository;
	
	@Override
	public List<Roles> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Roles> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Roles save(Roles roles) {
		return this.repository.save(roles);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
