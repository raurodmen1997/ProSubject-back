package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.service.EspacioService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class EspacioController{
	
	@Autowired
	private EspacioService espacioService;
	
	@GetMapping("/espacios")
	public List<Espacio> findAll(){
		return this.espacioService.findAll();
	}
	
	@GetMapping("/espacios/{id}")
	public Espacio findOne(@PathVariable Long id) {
		return this.espacioService.findOne(id);
	}
	
	@PostMapping(path="/anadirAlumno")
	public Espacio añadirAlumno(@Valid long espacioId,long alumnoId ) {
		Espacio espacio = new Espacio();
		try {
			espacio=this.espacioService.añadirAlumno(alumnoId,espacioId);
			return espacio;
		}catch(Exception e){
			espacio=this.espacioService.findOne(espacioId);
			return espacio;
		}
		
		
		
	}


}
