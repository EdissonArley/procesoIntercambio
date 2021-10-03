package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Ciudad;
import com.uninpahu.repository.CiudadRepository;

@Service
public class CiudadService {
	@Autowired
	private CiudadRepository ciudadRepository;

	public Ciudad agregarOActualizar(Ciudad ciudad) {
		return ciudadRepository.save(ciudad);
	}

	public boolean eliminarPorId(int id) {
		ciudadRepository.deleteById(id);
		return true;
	}
	
	public List<Ciudad> traerTodo(){
		return ciudadRepository.findAll();
	}

	public Ciudad traerPorId(int id) {
		return ciudadRepository.findById(id).get();
	}
}
