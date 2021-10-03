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

import com.uninpahu.entity.Ciudad;
import com.uninpahu.service.CiudadService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH})
@RestController
@RequestMapping("/ciudad")
public class ciudadController {

	@Autowired
	private CiudadService ciudadService; 
	
	@GetMapping
	public List<Ciudad> traerTodo(){
		return ciudadService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Ciudad traerPorId(@PathVariable int id) {
		return ciudadService.traerPorId(id);
	}
	
	@PostMapping
	public Ciudad agregar(Ciudad ciudad) {
		return ciudadService.agregarOActualizar(ciudad);
	}
	
	@PutMapping("/{id}")
	public Ciudad actualizar(@PathVariable int id,@RequestBody Ciudad ciudad) {
		ciudad.setCiudadId(id);
		return ciudadService.agregarOActualizar(ciudad);
	}
	

}
