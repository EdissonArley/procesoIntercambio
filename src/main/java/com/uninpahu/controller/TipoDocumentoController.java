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

import com.uninpahu.entity.TipoDocumento;
import com.uninpahu.service.TipoDocumentoService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/tipoDocumento")
public class TipoDocumentoController {

	@Autowired
	private TipoDocumentoService tipoDocumentoService; 

	@GetMapping
	public List<TipoDocumento> traerTodo(){
		return tipoDocumentoService.traerTodo();
	}

	@GetMapping("/{id}")
	public TipoDocumento traerPorId(@PathVariable int id) {
		return tipoDocumentoService.traerPorId(id);
	}

	@PostMapping
	public TipoDocumento agregar(TipoDocumento tipoDocumento) {
		return tipoDocumentoService.agregarOActualizar(tipoDocumento);
	}

	@PutMapping("/{id}")
	public TipoDocumento actualizar(@PathVariable int id,@RequestBody TipoDocumento tipoDocumento) {
		tipoDocumento.setTipoDocumentoId(id);
		return tipoDocumentoService.agregarOActualizar(tipoDocumento);
	}



}
