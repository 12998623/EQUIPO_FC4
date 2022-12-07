package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Municipios;

public interface IMunicipiosService {

public List<Municipios> all();
	
	public Optional<Municipios> findById(String id);
	
	public Municipios save(Municipios municipios);
	
	public void delete(String id);
}
