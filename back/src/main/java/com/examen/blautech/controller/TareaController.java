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
import com.examen.blautech.service.TareaService;



@RestController
@RequestMapping("/apiTarea")
public class TareaController {
	
	@Autowired
	private TareaService tareaService;
	
	
	@GetMapping("/tareas")
	public List<Tarea> allPersons(){
		return tareaService.findAll();
	}
	
	@GetMapping("/tarea/{id}")
	public Optional<Tarea> findById(@PathVariable("id") Long id) {
		return tareaService.findById(id);
	}
	
	@PostMapping("/tarea")
	public Tarea createPerson(@RequestBody Tarea tarea) {
		return tareaService.save(tarea);
	}
	
	@PutMapping("/tarea/{id}")
	public Tarea updatePerson(@PathVariable long id ,@RequestBody Tarea tarea) {
		return tareaService.save(tarea);
	}
	
	@DeleteMapping("/tarea/{id}")
	public void deletePerson(@PathVariable("id") Long id) {
		tareaService.deleteById(id);
	}

}
