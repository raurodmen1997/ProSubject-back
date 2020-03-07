package com.prosubject.prosubject.backend.apirest.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prosubject.prosubject.backend.apirest.model.Persona;
import com.prosubject.prosubject.backend.apirest.repository.PersonaRepository;

@Service
public class PersonaService  {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> findAll(){
		return this.personaRepository.findAll();
	}
	
	public Persona create() {
		final Persona p = new Persona();
		return p;
	
	}
	
	public Persona findOneById(final long personaID) {
		return this.personaRepository.findOneById(personaID);
	}
	
	public Persona save(final Persona p) {
		Persona saved = this.personaRepository.save(p);
		return saved;
	}
}
