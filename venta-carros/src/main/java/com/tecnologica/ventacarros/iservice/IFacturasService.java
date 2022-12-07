package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.Facturas;

public interface IFacturasService {

public List<Facturas> all();
	
	public Optional<Facturas> findById(String id);
	
	public Facturas save(Facturas facturas);
	
	public void delete(String id);
}
