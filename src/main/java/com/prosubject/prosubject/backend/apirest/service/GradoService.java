package com.prosubject.prosubject.backend.apirest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.prosubject.prosubject.backend.apirest.model.Grado;
import com.prosubject.prosubject.backend.apirest.repository.GradoRepository;

@Service
public class GradoService{
	
	@Autowired
	private GradoRepository gradoRepository;
	
	
	public Grado create() {
		final Grado res = new Grado();
		return res;
	}


	
	public List<Grado> findAll() {
		return this.gradoRepository.findAll();
	}
	public Grado findOne(final long gradoId) {
		return this.gradoRepository.findOnebyId(gradoId);
	}

	
	public Grado save(final Grado c) { 
		
		Grado saved = this.gradoRepository.save(c);
		
	return saved;
		
		
	}

}
 

