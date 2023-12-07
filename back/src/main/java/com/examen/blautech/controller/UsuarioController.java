package com.examen.blautech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.blautech.model.Tarea;
import com.examen.blautech.model.Usuario;
import com.examen.blautech.service.TareaService;
import com.examen.blautech.service.UsuarioService;

@RestController
@RequestMapping("/apiUsuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping("/usuarios")
	public List<Usuario> allPersons(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Optional<Usuario> findById(@PathVariable("id") Long id) {
		return usuarioService.findById(id);
	}
	
	@PostMapping("/usuario")
	public Usuario createPerson(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@PutMapping("/usuario/{id}")
	public Usuario updatePerson(@PathVariable long id ,@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void deletePerson(@PathVariable("id") Long id) {
		usuarioService.deleteById(id);
	}

}
