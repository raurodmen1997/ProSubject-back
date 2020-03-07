package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prosubject.prosubject.backend.apirest.model.Grado;
import com.prosubject.prosubject.backend.apirest.service.GradoService;

@RestController
@RequestMapping("/grado")
public class GradoController{
	
	@Autowired
	private GradoService gradoService;
	
	@GetMapping("/lista")
	public List<Grado> findAll(){
		return this.gradoService.findAll();
		
	}
	
	@GetMapping("/id")
	public Grado findOne(long gradoId){
		return this.gradoService.findOne(gradoId);
		
	}

}
 

