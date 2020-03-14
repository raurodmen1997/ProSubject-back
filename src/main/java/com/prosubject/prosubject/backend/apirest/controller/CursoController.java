package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Curso;
import com.prosubject.prosubject.backend.apirest.service.CursoService;

@RestController

@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CursoController {

	
	@Autowired
	private CursoService cursoService;
	
	
	@GetMapping("/cursos")
	public List<Curso> findAll(){
		return this.cursoService.findAll();
	}
	
	
	@GetMapping("/cursos/{id}")
	public Curso findOne(@PathVariable Long id){
		return this.cursoService.findOne(id);
	}
	
	

}
