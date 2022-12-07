package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Document("personas") 
public class Personas {
	
	@Id	
	private String Id;
	
	@Field("documento")
	private String Documento;
	
	@Field("nombre")
	private String Nombre;
	
	@Field("apellido")
	private String Apellido;
	
	@Field("correo")
	private String Correo;
	
	@Field("telefono")
	private String Telefono;
	
	@Field("estado")
	private Boolean Estado;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}
}
