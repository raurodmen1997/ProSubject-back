package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prosubject.prosubject.backend.apirest.model.Universidad;
import com.prosubject.prosubject.backend.apirest.repository.UniversidadRepository;


@RestController
@RequestMapping("/universidad")
public class UniversidadController {
	
	@Autowired
	private UniversidadRepository universidadRepository;
	
	@GetMapping("/lista")
	public List<Universidad> findAll(){
		return this.universidadRepository.findAll();
	}
	
	@GetMapping("/id")
	public Universidad findOne(long universidadId) {
		return this.universidadRepository.findOneById(universidadId);
	}
}
