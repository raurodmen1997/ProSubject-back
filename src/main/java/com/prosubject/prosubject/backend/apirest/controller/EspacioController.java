package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;
import com.prosubject.prosubject.backend.apirest.service.EspacioService;

@RestController
@RequestMapping("/espacio")
public class EspacioController {
	
	@Autowired
	private EspacioRepository espacioRepository;
	
	@GetMapping("/lista")
	public List<Espacio> findAll(){
		return this.espacioRepository.findAll();
	}
	
	@GetMapping("/id")
	public Espacio findOne(long espacioId) {
		return this.espacioRepository.findOneById(espacioId);
	}
}
