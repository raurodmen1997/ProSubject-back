package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Profesor;
import com.prosubject.prosubject.backend.apirest.service.ProfesorService;

@RestController
@RequestMapping("/api/profesores")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ProfesorController {

	
	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("")
	public List<Profesor> findAll(){
		return this.profesorService.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Profesor findOne(@PathVariable Long id){
		return this.profesorService.findOne(id);
		
	}
}
