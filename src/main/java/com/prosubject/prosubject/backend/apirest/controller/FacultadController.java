package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Facultad;
import com.prosubject.prosubject.backend.apirest.service.FacultadService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class FacultadController {

	@Autowired
	private FacultadService facultadService;
	
	@GetMapping("/facultades")
	public List<Facultad> findAll(){
		return this.facultadService.findAll();
		
	}
	
	@GetMapping("/facultades/{id}")
	public Facultad findOne(@PathVariable Long id){
		return this.facultadService.findOne(id);
		
	}
	
	@GetMapping("/facultades/busquedaFacultades")
	public List<Facultad> findFacuUni(@RequestParam String universidad){
		return this.facultadService.findFacuUni(universidad);
	}

	
}
