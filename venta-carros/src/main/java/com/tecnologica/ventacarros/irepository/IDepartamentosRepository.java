package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Departamentos;

public interface IDepartamentosRepository extends MongoRepository<Departamentos, String>{

}
