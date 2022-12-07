package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;


@Document("continentes")
public class Continentes {
	
	@Id	
	private String Id;
	
	@Field("Codigo")
	private String Codigo;

	@Field("Descripcion")
	private String Descripcion;
	
	@Field("Estado")
	private Boolean Estado;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}	
}
