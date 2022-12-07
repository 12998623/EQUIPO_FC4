package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Paises;

public interface IPaisesRepository extends MongoRepository<Paises, String>{

}
