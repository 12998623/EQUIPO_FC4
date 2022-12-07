package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Municipios;

public interface IMunicipiosRepository extends MongoRepository<Municipios, String>{

}
