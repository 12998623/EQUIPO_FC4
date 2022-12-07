package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.TiposVehiculos;

public interface ITiposVehiculosRepository extends MongoRepository<TiposVehiculos, String>{

}
