package com.uninpahu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uninpahu.entity.Usuario;
import com.uninpahu.service.UsuarioService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PATCH ,RequestMethod.DELETE})
@RestController
@RequestMapping("/usuario")
public class UsuarioController {


	@Autowired
	private UsuarioService usuarioService; 
	
	@GetMapping
	public List<Usuario> traerTodo(){
		return usuarioService.traerTodo();
	}
	
	@GetMapping("/{id}")
	public Usuario traerPorId(@PathVariable int id) {
		return usuarioService.traerPorId(id);
	}
	
	@PostMapping
	public Usuario agregar(Usuario usuario) {
		return usuarioService.agregarOActualizar(usuario);
	}
	
	@PutMapping("/{id}")
	public Usuario actualizar(@PathVariable int id,@RequestBody Usuario usuario) {
		usuario.setUsuarioId(id);
		return usuarioService.agregarOActualizar(usuario);
	}
	


}
