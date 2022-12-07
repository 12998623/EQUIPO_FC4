package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Vehiculos;

public interface IVehiculosRepository extends MongoRepository<Vehiculos, String>{

}
