package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Ciudad;
import com.uninpahu.entity.Formulario;
import com.uninpahu.repository.FormularioRepository;

@Service
public class FormularioService {
	@Autowired
	private FormularioRepository formularioRepository;

	public Formulario agregarOActualizar(Formulario formulario) {
		return formularioRepository.save(formulario);
	}

	public boolean eliminarPorId(int id) {
		formularioRepository.deleteById(id);
		return true;
	}
	
	public List<Formulario> traerTodo(){
		return formularioRepository.findAll();
	}

	public Formulario traerPorId(int id) {
		return formularioRepository.findById(id).get();
	}
}
