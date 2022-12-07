package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Continentes;

public interface IContinentesService {

public List<Continentes> all();
	
	public Optional<Continentes> findById(String id);
	
	public Continentes save(Continentes continentes);
	
	public void delete(String id);
}
