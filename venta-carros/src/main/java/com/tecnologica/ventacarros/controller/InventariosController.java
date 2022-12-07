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

import com.tecnologica.ventacarros.collection.Inventarios;
import com.tecnologica.ventacarros.iservice.IInventariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/inventarios")
public class InventariosController {

	@Autowired
	private IInventariosService service;

	@GetMapping
	public List<Inventarios> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Inventarios> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Inventarios save(@RequestBody Inventarios inventarios) {
		return service.save(inventarios);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Inventarios update(@PathVariable String id, @RequestBody Inventarios inventarios) {
		Optional<Inventarios> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Inventarios inventariosUpdate = op.get();
			inventariosUpdate.setPrecioUnitario(inventarios.getPrecioUnitario());
			inventariosUpdate.setCantidadExistente(inventarios.getCantidadExistente());
			inventariosUpdate.setObservacion(inventarios.getObservacion());
			inventariosUpdate.setEstado(inventarios.getEstado());			
			inventariosUpdate.setVehiculoId(inventarios.getVehiculoId());
			inventariosUpdate.setTipoEstado(inventarios.getTipoEstado());
			return service.save(inventariosUpdate);
		}
		
		return inventarios;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
