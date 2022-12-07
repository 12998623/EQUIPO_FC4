package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Inventarios;

public interface IInventariosRepository extends MongoRepository<Inventarios, String>{

}
