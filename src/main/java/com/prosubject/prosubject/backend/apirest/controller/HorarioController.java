package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prosubject.prosubject.backend.apirest.model.Horario;
import com.prosubject.prosubject.backend.apirest.service.HorarioService;

@RestController
@RequestMapping("/api")
public class HorarioController{
	
	@Autowired
	private HorarioService horarioService;
	

	@GetMapping("/horarios")
	public List<Horario> findAll(){
		return this.horarioService.findAll();
	}
	
	@GetMapping("/horarios/{id}")
	public Horario findOne(@PathVariable Long id) {
		return this.horarioService.findOne(id);
	}
	
	@PostMapping("/horarios")
	public Horario crearHorario(@RequestBody Horario horario ) {
		horario = horarioService.save(horario);
		return horario;
	}



}
