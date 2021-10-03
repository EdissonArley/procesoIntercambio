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

import com.uninpahu.entity.Formulario;
import com.uninpahu.service.FormularioService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH})
@RestController
@RequestMapping("/formulario")
public class FormularioController {

	@Autowired
	private FormularioService formularioService; 
	
	@GetMapping
	public List<Formulario> traerTodo(){
		return formularioService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Formulario traerPorId(@PathVariable int id) {
		return formularioService.traerPorId(id);
	}
	
	@PostMapping
	public Formulario agregar(Formulario formulario) {
		return formularioService.agregarOActualizar(formulario);
	}
	
	@PutMapping("/{id}")
	public Formulario actualizar(@PathVariable int id,@RequestBody Formulario formulario) {
		formulario.setFormularioId(id);
		return formularioService.agregarOActualizar(formulario);
	}
	

}
