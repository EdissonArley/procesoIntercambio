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

import com.uninpahu.entity.Facultad;
import com.uninpahu.service.FacultadService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/facultad")
public class FacultadController {


	@Autowired
	private FacultadService facultadService; 
	
	@GetMapping
	public List<Facultad> traerTodo(){
		return facultadService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Facultad traerPorId(@PathVariable int id) {
		return facultadService.traerPorId(id);
	}
	
	@PostMapping
	public Facultad agregar(Facultad facultad) {
		return facultadService.agregarOActualizar(facultad);
	}
	
	@PutMapping("/{id}")
	public Facultad actualizar(@PathVariable int id,@RequestBody Facultad facultad) {
		facultad.setFacultadId(id);
		return facultadService.agregarOActualizar(facultad);
	}
	


}
