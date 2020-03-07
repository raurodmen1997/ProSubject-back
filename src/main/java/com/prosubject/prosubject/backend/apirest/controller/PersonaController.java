package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Persona;
import com.prosubject.prosubject.backend.apirest.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/lista")
	public List<Persona> findAll(){
		return this.personaService.findAll();
	}
	
	@GetMapping("/id")
	public Persona findOne( long personaID){
		return this.personaService.findOneById(personaID);
	}
}
