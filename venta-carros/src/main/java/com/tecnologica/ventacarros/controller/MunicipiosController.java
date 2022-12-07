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

import com.tecnologica.ventacarros.collection.Municipios;
import com.tecnologica.ventacarros.iservice.IMunicipiosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/municipios")
public class MunicipiosController {

	@Autowired
	private IMunicipiosService service;

	@GetMapping
	public List<Municipios> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Municipios> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Municipios save(@RequestBody Municipios municipios) {
		return service.save(municipios);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Municipios update(@PathVariable String id, @RequestBody Municipios municipios) {
		Optional<Municipios> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Municipios municipiosUpdate = op.get();
			municipiosUpdate.setCodigo(municipios.getCodigo());
			municipiosUpdate.setDescripcion(municipios.getDescripcion());
			municipiosUpdate.setEstado(municipios.getEstado());
			municipiosUpdate.setDepartamentoId(municipios.getDepartamentoId());
			return service.save(municipiosUpdate);
		}
		
		return municipios;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
