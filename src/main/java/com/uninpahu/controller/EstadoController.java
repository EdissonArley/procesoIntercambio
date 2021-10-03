package com.uninpahu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uninpahu.entity.Estado;
import com.uninpahu.service.EstadoService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH})
@RestController
@RequestMapping("/estado")
public class EstadoController {

	@Autowired
	private EstadoService estadoService; 

	@GetMapping
	public List<Estado> traerTodo(){
		return estadoService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Estado traerPorId(@PathVariable int id) {
		return estadoService.traerPorId(id);
	}
	
	@PostMapping
	public Estado agregar(@RequestBody Estado estado) {
		return estadoService.agregarOActualizar(estado);
	}
	
	@PutMapping("/{id}")
	public Estado actualizar(@PathVariable int id,@RequestBody Estado estado) {
		estado.setEstadoId(id);
		return estadoService.agregarOActualizar(estado);
	}
	


}
