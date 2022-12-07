package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;


@Document("muncipios") 
public class Municipios{

	@Id	
	private String Id;

	@Field("codigo")
	private String Codigo;

	@Field("descripcion")
	private String Descripcion;

	@Field("estado")
	private Boolean Estado;
	
	@DBRef
	private Departamentos DepartamentoId;

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

	public Departamentos getDepartamentoId() {
		return DepartamentoId;
	}

	public void setDepartamentoId(Departamentos departamentoId) {
		DepartamentoId = departamentoId;
	}
}
