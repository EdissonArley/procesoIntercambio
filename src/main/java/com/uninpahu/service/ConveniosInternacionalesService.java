package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.ConveniosInternacionales;
import com.uninpahu.repository.ConveniosInternacionalesRepository;

@Service
public class ConveniosInternacionalesService {
	@Autowired
	private ConveniosInternacionalesRepository conveniosInternacionalesRepository;

	public ConveniosInternacionales agregarOActualizar(ConveniosInternacionales conveniosInternacionales) {
		return conveniosInternacionalesRepository.save(conveniosInternacionales);
	}

	public boolean eliminarPorId(int id) {
		conveniosInternacionalesRepository.deleteById(id);
		return true;
	}
	
	public List<ConveniosInternacionales> traerTodo(){
		return conveniosInternacionalesRepository.findAll();
	}

	public ConveniosInternacionales traerPorId(int id) {
		return conveniosInternacionalesRepository.findById(id).get();
	}
}
