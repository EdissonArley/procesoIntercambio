package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Usuario;
import com.uninpahu.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario agregarOActualizar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public boolean eliminarPorId(int id) {
		usuarioRepository.deleteById(id);
		return true;
	}
	
	public List<Usuario> traerTodo(){
		return usuarioRepository.findAll();
	}

	public Usuario traerPorId(int id) {
		return usuarioRepository.findById(id).get();
	}

}
