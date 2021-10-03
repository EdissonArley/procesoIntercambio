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

import com.uninpahu.entity.Rol;
import com.uninpahu.service.RolService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/rol")
public class RolController {

	@Autowired
	private RolService rolService; 
	
	@GetMapping
	public List<Rol> traerTodo(){
		return rolService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Rol traerPorId(@PathVariable int id) {
		return rolService.traerPorId(id);
	}
	
	@PostMapping
	public Rol agregar(Rol rol) {
		return rolService.agregarOActualizar(rol);
	}
	
	@PutMapping("/{id}")
	public Rol actualizar(@PathVariable int id,@RequestBody Rol rol) {
		rol.setRolId(id);
		return rolService.agregarOActualizar(rol);
	}
}
