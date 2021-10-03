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

import com.uninpahu.entity.ProgramaAcademico;
import com.uninpahu.service.ProgramaAcademicoService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/programaAcademico")
public class ProgramaAcademicoController {

	@Autowired
	private ProgramaAcademicoService programaAcademicoService; 
	
	@GetMapping
	public List<ProgramaAcademico> traerTodo(){
		return programaAcademicoService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public ProgramaAcademico traerPorId(@PathVariable int id) {
		return programaAcademicoService.traerPorId(id);
	}
	
	@PostMapping
	public ProgramaAcademico agregar(ProgramaAcademico programaAcademico) {
		return programaAcademicoService.agregarOActualizar(programaAcademico);
	}
	
	@PutMapping("/{id}")
	public ProgramaAcademico actualizar(@PathVariable int id,@RequestBody ProgramaAcademico programaAcademico) {
		programaAcademico.setProgramaAcademicoId(id);
		return programaAcademicoService.agregarOActualizar(programaAcademico);
	}
}
