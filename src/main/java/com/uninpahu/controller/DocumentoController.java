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

import com.uninpahu.entity.Documento;
import com.uninpahu.service.DocumentoService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/documento")
public class DocumentoController {


	@Autowired
	private DocumentoService documentoService; 
	
	@GetMapping
	public List<Documento> traerTodo(){
		return documentoService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Documento traerPorId(@PathVariable int id) {
		return documentoService.traerPorId(id);
	}
	
	@PostMapping
	public Documento agregar(Documento documento) {
		return documentoService.agregarOActualizar(documento);
	}
	
	@PutMapping("/{id}")
	public Documento actualizar(@PathVariable int id,@RequestBody Documento documento) {
		documento.setDocumentoId(id);
		return documentoService.agregarOActualizar(documento);
	}
	



}
