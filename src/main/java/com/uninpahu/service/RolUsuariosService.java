package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.RolUsuarios;
import com.uninpahu.repository.RolUsuariosRepository;

@Service
public class RolUsuariosService {

	@Autowired
	private RolUsuariosRepository rolUsuariosRepository;

	public RolUsuarios agregarOActualizar(RolUsuarios rolUsuarios) {
		return rolUsuariosRepository.save(rolUsuarios);
	}

	public boolean eliminarPorId(int id) {
		rolUsuariosRepository.deleteById(id);
		return true;
	}

	public List<RolUsuarios> traerTodo(){
		return rolUsuariosRepository.findAll();
	}

	public RolUsuarios traerPorId(int id) {
		return rolUsuariosRepository.findById(id).get();
	}

}
