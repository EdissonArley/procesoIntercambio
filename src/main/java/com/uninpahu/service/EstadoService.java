package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Estado;
import com.uninpahu.repository.EstadoRepository;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository estadoRepository;

	public Estado agregarOActualizar(Estado estado) {
		return estadoRepository.save(estado);
	}

	public boolean eliminarPorId(int id) {
		estadoRepository.deleteById(id);
		return true;
	}
	
	public List<Estado> traerTodo(){
		return estadoRepository.findAll();
	}

	public Estado traerPorId(int id) {
		return estadoRepository.findById(id).get();
	}
}
