package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Administrador;
import com.prosubject.prosubject.backend.apirest.service.AdministradorService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AdministradorController{
	
	@Autowired
	private AdministradorService administradorService;
	
	@GetMapping("/administradores")
	public List<Administrador> findAll(){
		return this.administradorService.findAll();
	}
	
	@GetMapping("/administradores/{id}")
	public Administrador findOne(@PathVariable Long id) {
		return this.administradorService.findOne(id);
	}

	@PostMapping("/administradores")
	public Administrador crearAdministrador(@RequestBody Administrador administrador ) {
		administrador = administradorService.save(administrador);
		return administrador;
	}



}
