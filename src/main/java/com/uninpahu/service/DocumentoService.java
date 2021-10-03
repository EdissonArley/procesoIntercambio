package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Documento;
import com.uninpahu.repository.DocumentoRepository;


@Service
public class DocumentoService {
	@Autowired
	private DocumentoRepository documentoRepository;

	public Documento agregarOActualizar(Documento documento) {
		return documentoRepository.save(documento);
	}

	public boolean eliminarPorId(int id) {
		documentoRepository.deleteById(id);
		return true;
	}
	
	public List<Documento> traerTodo(){
		return documentoRepository.findAll();
	}

	public Documento traerPorId(int id) {
		return documentoRepository.findById(id).get();
	}
}
