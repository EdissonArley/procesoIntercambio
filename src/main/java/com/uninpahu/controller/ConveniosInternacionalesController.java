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

import com.uninpahu.entity.ConveniosInternacionales;
import com.uninpahu.service.ConveniosInternacionalesService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/conveniosInternacionales")
public class ConveniosInternacionalesController {


	@Autowired
	private ConveniosInternacionalesService conveniosInternacionalesService; 
	
	@GetMapping
	public List<ConveniosInternacionales> traerTodo(){
		return conveniosInternacionalesService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public ConveniosInternacionales traerPorId(@PathVariable int id) {
		return conveniosInternacionalesService.traerPorId(id);
	}
	
	@PostMapping
	public ConveniosInternacionales agregar(ConveniosInternacionales conveniosInternacionales) {
		return conveniosInternacionalesService.agregarOActualizar(conveniosInternacionales);
	}
	
	@PutMapping("/{id}")
	public ConveniosInternacionales actualizar(@PathVariable int id,@RequestBody ConveniosInternacionales conveniosInternacionales) {
		conveniosInternacionales.setConveniosInternacionalesId(id);
		return conveniosInternacionalesService.agregarOActualizar(conveniosInternacionales);
	}
}
