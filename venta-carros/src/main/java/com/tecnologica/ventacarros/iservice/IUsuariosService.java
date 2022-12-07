package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Usuarios;

public interface IUsuariosService {

public List<Usuarios> all();
	
	public Optional<Usuarios> findById(String id);
	
	public Usuarios save(Usuarios usuarios);
	
	public void delete(String id);
}
