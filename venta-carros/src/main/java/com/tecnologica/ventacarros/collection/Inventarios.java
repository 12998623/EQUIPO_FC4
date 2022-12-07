package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;


@Document("inventarios")
public class Inventarios{

	@Id	
	private String Id;

	@Field("precioUnitario")
	private Double PrecioUnitario;

	@Field("cantidadExistente")
	private Integer CantidadExistente;

	@Field("observacio")
	private String Observacion;

	@Field("estado")
	private Boolean Estado;

	@Field("tipoEstado")
	private Boolean TipoEstado;

	@DBRef
	private Vehiculos VehiculoId;
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Double getPrecioUnitario() {
		return PrecioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}

	public Integer getCantidadExistente() {
		return CantidadExistente;
	}

	public void setCantidadExistente(Integer cantidadExistente) {
		CantidadExistente = cantidadExistente;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Vehiculos getVehiculoId() {
		return VehiculoId;
	}

	public void setVehiculoId(Vehiculos vehiculoId) {
		VehiculoId = vehiculoId;
	}

	public Boolean getTipoEstado() {
		return TipoEstado;
	}

	public void setTipoEstado(Boolean tipoEstado) {
		TipoEstado = tipoEstado;
	}

}
