package com.examen.blautech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.blautech.model.Tarea;
import com.examen.blautech.model.Usuario;
import com.examen.blautech.repository.UsuarioRepository;
import com.examen.blautech.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public void deleteById(Long id) {
	usuarioRepository.deleteById(id);
		
	}

}
