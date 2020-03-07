package com.prosubject.prosubject.backend.apirest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;

@Service
public class EspacioService {
	@Autowired
	private EspacioRepository espacioRepository;
	
	public Espacio create() {
		final Espacio e = new Espacio();
		return e;
	}
	
	public Collection<Espacio> findAll() {
		return this.espacioRepository.findAll();
	}
	
	public Espacio findOne(final long espacioId){
		return this.espacioRepository.findOneById(espacioId);
	}
	
	public Espacio save(final Espacio e) {
		Espacio saved = this.espacioRepository.save(e);
		return saved;
		
	}
	
	
}

