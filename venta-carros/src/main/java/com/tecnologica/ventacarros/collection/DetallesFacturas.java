package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;


@Document("detallesFacturas")
public class DetallesFacturas{
	
	@Id	
	private String Id;
	
	@Field("cantidad")
	private String Cantidad;
	
	@Field("precio")
	private Integer Precio;

	@Field("estado")
	private Boolean Estado;
	
	@DBRef
	private Facturas FacturaId;
		
	@DBRef
	private Inventarios InventarioId;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public Integer getPrecio() {
		return Precio;
	}

	public void setPrecio(Integer precio) {
		Precio = precio;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Facturas getFacturaId() {
		return FacturaId;
	}

	public void setFacturaId(Facturas facturaId) {
		FacturaId = facturaId;
	}

	public Inventarios getInventarioId() {
		return InventarioId;
	}

	public void setInventarioId(Inventarios inventarioId) {
		InventarioId = inventarioId;
	}
}
