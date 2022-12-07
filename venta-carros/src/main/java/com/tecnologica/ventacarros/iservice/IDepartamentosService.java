package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Departamentos;

public interface IDepartamentosService {

public List<Departamentos> all();
	
	public Optional<Departamentos> findById(String id);
	
	public Departamentos save(Departamentos departamentos);
	
	public void delete(String id);
}
