package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Estudiante;
import com.uninpahu.repository.EstudianteRepository;

@Service
public class EstudianteService {

	@Autowired
	private EstudianteRepository estudianteRepository;
	
	public Estudiante agregarOActualizar(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}

	public boolean eliminarPorId(int id) {
		estudianteRepository.deleteById(id);
		return true;
	}
	
	public List<Estudiante> traerTodo(){
		return estudianteRepository.findAll();
	}

	public Estudiante traerPorId(int id) {
		return estudianteRepository.findById(id).get();
	}
	
}
