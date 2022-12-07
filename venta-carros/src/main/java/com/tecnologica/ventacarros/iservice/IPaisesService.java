package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Paises;

public interface IPaisesService {

public List<Paises> all();
	
	public Optional<Paises> findById(String id);
	
	public Paises save(Paises paises);
	
	public void delete(String id);
}
