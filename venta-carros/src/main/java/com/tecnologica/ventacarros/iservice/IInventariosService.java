package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Inventarios;

public interface IInventariosService {

public List<Inventarios> all();
	
	public Optional<Inventarios> findById(String id);
	
	public Inventarios save(Inventarios inventarios);
	
	public void delete(String id);
}
