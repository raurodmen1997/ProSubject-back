package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.service.EspacioService;
import com.prosubject.prosubject.backend.apirest.service.ForoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class EspacioController{

	
	@Autowired
	private EspacioService espacioService;
	@Autowired
	private ForoService foroService;
	
	@GetMapping("/espacios")
	public List<Espacio> findAll(){
		return this.espacioService.findAll();
	}
	
	@GetMapping("/espaciosDisponibles")
	public List<Espacio> findDisponibles(@RequestParam(value="universidad") String universidad, 
			@RequestParam(value="facultad") String facultad,
			@RequestParam(value="curso") String curso,
			@RequestParam(value="asignatura") String asignatura){
		return this.espacioService.findDisponibles(universidad, facultad, curso, asignatura);
	}
		
	@GetMapping("/espacios/{id}")
	public Espacio findOne(@PathVariable Long id) {
		return this.espacioService.findOne(id);
	}
	
	
	@PostMapping("/espacios")
	public Espacio crearEspacio(@RequestBody Espacio espacio ) {
		Espacio e = new Espacio();
		try {
			
			e = this.espacioService.save(espacio);
			
		}catch(Exception ex){
			this.foroService.delete(espacio.getForo());
		
		}
		
		return e;
		
	}
	@PostMapping(path="/anadirAlumno")
	public Espacio añadirAlumno(@Valid long espacioId,long alumnoId ) {
		Espacio espacio = new Espacio();
		try {
			espacio=this.espacioService.añadirAlumno(alumnoId,espacioId);
			
		}catch(Exception e){
			espacio=this.espacioService.findOne(espacioId);
			
		}
		return espacio;
		
		
		
	}
	
	@GetMapping("/espaciosProfesor/{id}")
	public List<Espacio> espaciosDeUnProfesor(@PathVariable Long id) {
		return this.espacioService.espaciosDeUnProfesor(id);
	}
	
	@GetMapping("/espaciosAlumno/{id}")
	public List<Espacio> espaciosDeUnAlumno(@PathVariable Long id) {
		return this.espacioService.espaciosDeUnAlumno(id);
	}


}
