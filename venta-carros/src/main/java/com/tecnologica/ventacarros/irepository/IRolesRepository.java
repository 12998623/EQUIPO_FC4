package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Roles;

public interface IRolesRepository extends MongoRepository<Roles, String>{

}
