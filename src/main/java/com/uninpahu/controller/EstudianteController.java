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

import com.uninpahu.entity.Estudiante;
import com.uninpahu.repository.EstudianteDto;
import com.uninpahu.service.EstudianteService;
import com.uninpahu.service.QueryByStudent;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {


	@Autowired
	private EstudianteService estudianteService; 
	
	@GetMapping
	public List<Estudiante> traerTodo(){
		return estudianteService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Estudiante traerPorId(@PathVariable int id) {
		return estudianteService.traerPorId(id);
	}
	
	@PostMapping
	public Estudiante agregar(Estudiante estudiante) {
		return estudianteService.agregarOActualizar(estudiante);
	}
	
	@PutMapping("/{id}")
	public Estudiante actualizar(@PathVariable int id,@RequestBody Estudiante estudiante) {
		estudiante.setEstudianteId(id);
		return estudianteService.agregarOActualizar(estudiante);
	}
}
