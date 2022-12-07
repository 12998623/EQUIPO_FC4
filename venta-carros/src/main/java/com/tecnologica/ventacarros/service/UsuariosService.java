package com.tecnologica.ventacarros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologica.ventacarros.collection.Usuarios;
import com.tecnologica.ventacarros.irepository.IUsuariosRepository;
import com.tecnologica.ventacarros.iservice.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService{

	@Autowired
	private IUsuariosRepository repository;
	
	@Override
	public List<Usuarios> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Usuarios> findById(String id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Usuarios save(Usuarios usuarios) {
		return this.repository.save(usuarios);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
