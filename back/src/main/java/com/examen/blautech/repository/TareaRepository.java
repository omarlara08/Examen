package com.examen.blautech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.examen.blautech.model.Tarea;

@Repository
public interface TareaRepository  extends JpaRepository<Tarea, Long> {
	
	Optional<Tarea> findById(@Param("id") Long id);

}
