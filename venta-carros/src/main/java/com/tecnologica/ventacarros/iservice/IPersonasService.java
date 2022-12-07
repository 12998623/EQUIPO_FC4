package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Personas;

public interface IPersonasService {

public List<Personas> all();
	
	public Optional<Personas> findById(String id);
	
	public Personas save(Personas personas);
	
	public void delete(String id);
}
