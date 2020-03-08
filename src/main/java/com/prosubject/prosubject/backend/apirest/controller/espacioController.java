package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.service.EspacioService;

@RestController
@RequestMapping("/api")
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
	public void añadirAlumno( long espacioId,long alumnoId  ) {
		this.espacioService.añadirAlumno(alumnoId,espacioId);
		
		
	}


}
