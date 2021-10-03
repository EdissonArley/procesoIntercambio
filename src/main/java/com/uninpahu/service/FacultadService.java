package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Facultad;
import com.uninpahu.repository.FacultadRepository;

@Service
public class FacultadService {

	@Autowired
	private FacultadRepository facultadRepository;

	public Facultad agregarOActualizar(Facultad facultad) {
		return facultadRepository.save(facultad);
	}

	public boolean eliminarPorId(int id) {
		facultadRepository.deleteById(id);
		return true;
	}
	
	public List<Facultad> traerTodo(){
		return facultadRepository.findAll();
	}

	public Facultad traerPorId(int id) {
		return facultadRepository.findById(id).get();
	}

}
