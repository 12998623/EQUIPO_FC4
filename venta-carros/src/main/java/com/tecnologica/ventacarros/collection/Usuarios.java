package com.tecnologica.ventacarros.collection;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;


@Document("usuarios")
public class Usuarios {

	@Id	
	private String Id;
	
	@Field("contrasenia")
	private String Contrasenia;
	
	@Field("usuario")
	private String Usuario;
	
	@Field("estado")
	private Boolean Estado;
	
	@DBRef
	private Personas PersonaId;	
	
	@DBRef
	private Roles RolId;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}


	public String getContrasenia() {
		return Contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}


	public String getUsuario() {
		return Usuario;
	}


	public void setUsuario(String usuario) {
		Usuario = usuario;
	}


	public Boolean getEstado() {
		return Estado;
	}


	public void setEstado(Boolean estado) {
		Estado = estado;
	}


	public Personas getPersonaId() {
		return PersonaId;
	}


	public void setPersonaId(Personas personaId) {
		PersonaId = personaId;
	}


	public Roles getRolId() {
		return RolId;
	}


	public void setRolId(Roles rolId) {
		RolId = rolId;
	}
}
