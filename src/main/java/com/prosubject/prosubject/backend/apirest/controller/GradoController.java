package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.prosubject.prosubject.backend.apirest.model.Grado;
import com.prosubject.prosubject.backend.apirest.service.GradoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
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
	
	@GetMapping("/grados/busquedaGrados")
	public List<Grado> findGradoFacu(@RequestParam String universidad,
			@RequestParam String facultad){
		return this.gradoService.findGradoFacu(universidad, facultad);
	}

}
 

