package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Transaccion;
import com.uninpahu.repository.TransaccionRepository;

@Service
public class TransaccionService {

	@Autowired
	private TransaccionRepository transaccionRepository;

	public Transaccion agregarOActualizar(Transaccion transaccion) {
		return transaccionRepository.save(transaccion);
	}

	public boolean eliminarPorId(int id) {
		transaccionRepository.deleteById(id);
		return true;
	}
	
	public List<Transaccion> traerTodo(){
		return transaccionRepository.findAll();
	}

	public Transaccion traerPorId(int id) {
		return transaccionRepository.findById(id).get();
	}

}
