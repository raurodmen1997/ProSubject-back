package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.service.EspacioService;

@RestController
@RequestMapping("/espacio")
public class espacioController{
	
	@Autowired
	private EspacioService espacioService;
	
	@GetMapping("/lista")
	public List<Espacio> findAll(){
		return this.espacioService.findAll();
	}
	
	@GetMapping("/id")
	public Espacio findOne(long espacioId) {
		return this.espacioService.findOne(espacioId);
	}
	
	@PostMapping(path="/anadirAlumno")
	public void añadirAlumno( long espacioId,long alumnoId  ) {
		this.espacioService.añadirAlumno(alumnoId,espacioId);
		
		
	}


}
