package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;


@Document("vehiculos") 
public class Vehiculos{
	
	@Id	
	private String Id;
	
	@Field("codigo")
	private String Codigo;
	
	@Field("descripcion")
	private String Descripcion;
	
	@Field("color")
	private String Color;
	
	@Field("cilindraje")
	private String Cilindraje;
	
	@Field("kilometraje")
	private Integer Kilometraje;

	@Field("estado")
	private Boolean Estado;
	
	@DBRef
	private TiposVehiculos TipoVehiculoId;
		
	@DBRef
	private Marcas MarcaId;

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

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getCilindraje() {
		return Cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		Cilindraje = cilindraje;
	}

	public Integer getKilometraje() {
		return Kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		Kilometraje = kilometraje;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public TiposVehiculos getTipoVehiculoId() {
		return TipoVehiculoId;
	}

	public void setTipoVehiculoId(TiposVehiculos tipoVehiculoId) {
		TipoVehiculoId = tipoVehiculoId;
	}

	public Marcas getMarcaId() {
		return MarcaId;
	}

	public void setMarcaId(Marcas marcaId) {
		MarcaId = marcaId;
	}
}
