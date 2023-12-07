package com.examen.blautech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.blautech.model.Tarea;
import com.examen.blautech.repository.TareaRepository;
import com.examen.blautech.service.TareaService;

public class TareaServiceImpl implements TareaService{
	
	@Autowired
	private TareaRepository tareaRepository;

	@Override
	public List<Tarea> findAll() {
		return tareaRepository.findAll();
	}

	@Override
	public Optional<Tarea> findById(Long id) {		
		return tareaRepository.findById(id);
	}

	@Override
	public Tarea save(Tarea tarea) {		
		return tareaRepository.save(tarea);
	}

	@Override
	public void deleteById(Long id) {		
		tareaRepository.deleteById(id);
	}

}
