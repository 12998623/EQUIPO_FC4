package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tecnologica.ventacarros.collection.DetallesFacturas;

public interface IDetallesFacturasRepository extends MongoRepository<DetallesFacturas, String>{

}
