package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Universidad;
import com.prosubject.prosubject.backend.apirest.service.UniversidadService;


@RestController
@RequestMapping("/api")

public class UniversidadController {

	
	@Autowired
	private UniversidadService universidadService;
	
	@GetMapping("/universidades")
	public List<Universidad> findAll(){
		return this.universidadService.findAll();
	}
	
	@GetMapping("/universidades/{id}")
	public Universidad findOne(@PathVariable Long id){
		return this.universidadService.findOne(id);
	}
}
