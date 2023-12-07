package com.examen.blautech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.examen.blautech.model.Usuario;

@Service
public interface UsuarioService {

	List<Usuario> findAll();

	Optional<Usuario> findById(Long id);

	Usuario save(Usuario usuario);

	void deleteById(Long id);

}
