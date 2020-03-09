package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Foro;
import com.prosubject.prosubject.backend.apirest.service.ForoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ForoController {

	@Autowired
	private ForoService foroService;
	
	@GetMapping("/foros")
	public List<Foro> findAll(){
		return this.foroService.findAll();
		
	}
	
	@GetMapping("/foros/{id}")
	public Foro findOne(@PathVariable Long id){
		return this.foroService.findOne(id);
		
	}
	
}
