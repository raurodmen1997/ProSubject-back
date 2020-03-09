package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prosubject.prosubject.backend.apirest.model.Grado;
import com.prosubject.prosubject.backend.apirest.service.GradoService;

@RestController
@RequestMapping("/api")
public class GradoController{
	
	@Autowired
	private GradoService gradoService;
	
	@GetMapping("/grados")
	public List<Grado> findAll(){
		return this.gradoService.findAll();
		
	}
	
	@GetMapping("/grados/{id}")
	public Grado findOne(@PathVariable Long id){
		return this.gradoService.findOne(id);
		
	}

}
 

