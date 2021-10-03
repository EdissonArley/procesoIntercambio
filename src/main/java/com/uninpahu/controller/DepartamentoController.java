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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uninpahu.entity.Departamento;
import com.uninpahu.service.DepartamentoService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH})
@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	@Autowired
	private DepartamentoService departamentoService; 

	@GetMapping
	public List<Departamento> traerTodo(){
		return departamentoService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Departamento traerPorId(@PathVariable int id) {
		return departamentoService.traerPorId(id);
	}
	
	@PostMapping
	public Departamento agregar(@RequestBody Departamento departamento) {
		return departamentoService.agregarOActualizar(departamento);
	}
	
	@PutMapping("/{id}")
	public Departamento actualizar(@PathVariable int id,@RequestBody Departamento departamento) {
		departamento.setDepartamentoId(id);
		return departamentoService.agregarOActualizar(departamento);
	}
	
}
