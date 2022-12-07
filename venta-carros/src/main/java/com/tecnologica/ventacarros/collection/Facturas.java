package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

import org.springframework.data.annotation.Id;


@Document("facturas") 
public class Facturas{
	
	@Id	
	private String Id;
	
	@Field("codigo")
	private String Codigo;
	
	@Field("valorTotal")
	private Integer ValorTotal;

	@Field("fecha")
	private Date Fecha;
	
	@Field("estado")
	private Boolean Estado;
	
	@DBRef
	private Municipios MunicipioId;
	
	@DBRef
	private Personas PersonaId;

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

	public Integer getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		ValorTotal = valorTotal;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Municipios getMunicipioId() {
		return MunicipioId;
	}

	public void setMunicipioId(Municipios municipioId) {
		MunicipioId = municipioId;
	}

	public Personas getPersonaId() {
		return PersonaId;
	}

	public void setPersonaId(Personas personaId) {
		PersonaId = personaId;
	}
}
