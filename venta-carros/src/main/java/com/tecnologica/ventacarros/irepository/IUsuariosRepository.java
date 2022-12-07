package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Usuarios;

public interface IUsuariosRepository extends MongoRepository<Usuarios, String>{

}
