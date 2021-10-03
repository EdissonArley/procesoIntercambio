package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Rol;
import com.uninpahu.repository.RolRepository;

@Service
public class RolService {

	@Autowired
	private RolRepository rolRepository;

	public Rol agregarOActualizar(Rol rol) {
		return rolRepository.save(rol);
	}

	public boolean eliminarPorId(int id) {
		rolRepository.deleteById(id);
		return true;
	}

	public List<Rol> traerTodo(){
		return rolRepository.findAll();
	}

	public Rol traerPorId(int id) {
		return rolRepository.findById(id).get();
	}

}
