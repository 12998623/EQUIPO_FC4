package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Facturas;

public interface IFacturasRepository extends MongoRepository<Facturas, String>{

}
