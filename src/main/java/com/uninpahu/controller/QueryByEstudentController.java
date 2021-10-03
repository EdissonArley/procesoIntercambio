package com.uninpahu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uninpahu.entity.Estudiante;
import com.uninpahu.repository.EstudianteDto;
import com.uninpahu.service.QueryByStudent;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/perfil/")
public class QueryByEstudentController {


	@Autowired
	private QueryByStudent queryByStudent;
	
	@GetMapping("documentByStudent/{id}")
	public EstudianteDto traerDocumentoByEstudiante(@PathVariable int id) {
		return queryByStudent.traerDocumentoByEstudiante(id);
	}
	
	@PutMapping("updateEstudiante/{id}")
	public void patchEstudiante(@PathVariable int id,@RequestBody EstudianteDto estudiante) {
		queryByStudent.patchEstudiante(estudiante, id);
	}
}
