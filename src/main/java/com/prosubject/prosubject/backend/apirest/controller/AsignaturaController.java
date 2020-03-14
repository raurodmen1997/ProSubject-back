package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Asignatura;
import com.prosubject.prosubject.backend.apirest.service.AsignaturaService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AsignaturaController {

	
	@Autowired
	private AsignaturaService asignaturaService;
	
	
	@GetMapping("/asignaturas")
	public List<Asignatura> findAll(){
		return this.asignaturaService.findAll();
	}
	
	
	@GetMapping("/asignaturas/{id}")
	public Asignatura findOne(@PathVariable Long id){
		return this.asignaturaService.findOne(id);
	}
	
	@GetMapping("/asignaturas/busquedaAsignaturas")
	public List<Asignatura> findListaAsignatura(@RequestParam String universidad, 
			@RequestParam String facultad,
			@RequestParam String grado,
			@RequestParam String curso){
		return this.asignaturaService.findListaAsignaturas(universidad, facultad, grado, curso);
	}
}
