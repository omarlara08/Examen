package com.examen.blautech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.examen.blautech.model.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findById(@Param("id") Long id);

}
