package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.ProgramaAcademico;
import com.uninpahu.repository.ProgramaAcademicoRepository;

@Service
public class ProgramaAcademicoService {

	@Autowired
	private ProgramaAcademicoRepository programaAcademicoRepository;

	public ProgramaAcademico agregarOActualizar(ProgramaAcademico programaAcademico) {
		return programaAcademicoRepository.save(programaAcademico);
	}

	public boolean eliminarPorId(int id) {
		programaAcademicoRepository.deleteById(id);
		return true;
	}
	
	public List<ProgramaAcademico> traerTodo(){
		return programaAcademicoRepository.findAll();
	}

	public ProgramaAcademico traerPorId(int id) {
		return programaAcademicoRepository.findById(id).get();
	}
}
