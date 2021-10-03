package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.TipoDocumento;
import com.uninpahu.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoService {

	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	public TipoDocumento agregarOActualizar(TipoDocumento tipoDocumento) {
		return tipoDocumentoRepository.save(tipoDocumento);
	}

	public boolean eliminarPorId(int id) {
		tipoDocumentoRepository.deleteById(id);
		return true;
	}
	
	public List<TipoDocumento> traerTodo(){
		return tipoDocumentoRepository.findAll();
	}

	public TipoDocumento traerPorId(int id) {
		return tipoDocumentoRepository.findById(id).get();
	}

}
