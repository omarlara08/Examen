package com.examen.blautech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.examen.blautech.model.Tarea;

@Service
public interface TareaService {

	List<Tarea> findAll();

	Optional<Tarea> findById(Long id);

	Tarea save(Tarea tarea);

	void deleteById(Long id);

}
