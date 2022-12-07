package com.tecnologica.ventacarros.iservice;

import java.util.List;
import java.util.Optional;

import com.tecnologica.ventacarros.collection.DetallesFacturas;

public interface IDetallesFacturasService {

public List<DetallesFacturas> all();
	
	public Optional<DetallesFacturas> findById(String id);
	
	public DetallesFacturas save(DetallesFacturas detallesFacturas);
	
	public void delete(String id);
}
