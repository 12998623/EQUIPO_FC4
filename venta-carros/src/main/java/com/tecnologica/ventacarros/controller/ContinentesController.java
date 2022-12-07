package com.tecnologica.ventacarros.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tecnologica.ventacarros.collection.Continentes;
import com.tecnologica.ventacarros.iservice.IContinentesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/continentes")
public class ContinentesController {

	@Autowired
	private IContinentesService service;

	@GetMapping
	public List<Continentes> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Continentes> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Continentes save(@RequestBody Continentes continentes) {
		return service.save(continentes);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Continentes update(@PathVariable String id, @RequestBody Continentes continentes) {
		Optional<Continentes> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Continentes continentesUpdate = op.get();
			continentesUpdate.setCodigo(continentes.getCodigo());
			continentesUpdate.setDescripcion(continentes.getDescripcion());
			continentesUpdate.setEstado(continentes.getEstado());
			return service.save(continentesUpdate);
		}
		
		return continentes;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
