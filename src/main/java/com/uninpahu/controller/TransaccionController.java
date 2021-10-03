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

import com.uninpahu.entity.Transaccion;
import com.uninpahu.service.TransaccionService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

	@Autowired
	private TransaccionService transaccionService; 
	
	@GetMapping
	public List<Transaccion> traerTodo(){
		return transaccionService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Transaccion traerPorId(@PathVariable int id) {
		return transaccionService.traerPorId(id);
	}
	
	@PostMapping
	public Transaccion agregar(Transaccion transaccion) {
		return transaccionService.agregarOActualizar(transaccion);
	}
	
	@PutMapping("/{id}")
	public Transaccion actualizar(@PathVariable int id,@RequestBody Transaccion transaccion) {
		transaccion.setTransaccionId(id);
		return transaccionService.agregarOActualizar(transaccion);
	}
	
}
