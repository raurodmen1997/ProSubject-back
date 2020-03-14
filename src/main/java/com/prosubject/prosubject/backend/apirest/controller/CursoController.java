package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Curso;
import com.prosubject.prosubject.backend.apirest.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	
	@GetMapping("/lista")
	public List<Curso> findAll(){
	return this.cursoService.findAll();
	}
	
	
	@GetMapping("/id")
	public Curso findOne(long cursoId){
	return this.cursoService.findOne(cursoId);
	}
	
	

}
