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

import com.uninpahu.entity.RolUsuarios;
import com.uninpahu.service.RolUsuariosService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/rolUsuarios")
public class RolUsuariosController {


	@Autowired
	private RolUsuariosService rolUsuariosService; 
	
	@GetMapping
	public List<RolUsuarios> traerTodo(){
		return rolUsuariosService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public RolUsuarios traerPorId(@PathVariable int id) {
		return rolUsuariosService.traerPorId(id);
	}
	
	@PostMapping
	public RolUsuarios agregar(RolUsuarios rolUsuarios) {
		return rolUsuariosService.agregarOActualizar(rolUsuarios);
	}
	
	@PutMapping("/{id}")
	public RolUsuarios actualizar(@PathVariable int id,@RequestBody RolUsuarios rolUsuarios) {
		rolUsuarios.setRolUsuariosId(id);
		return rolUsuariosService.agregarOActualizar(rolUsuarios);
	}
	


}
