package com.prosubject.prosubject.backend.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prosubject.prosubject.backend.apirest.model.Curso;
import com.prosubject.prosubject.backend.apirest.repository.CursoRepository;

@Service
public class CursoService {
	@Autowired
	private CursoRepository cursoRepository;
	
	
	public Curso create() {
		final Curso c = new Curso();
		return c;
	}
	
	public List<Curso> findAll() {
		return this.cursoRepository.findAll();
	}
	
	public Curso findOne(final long cursoId) {
		return this.cursoRepository.findById(cursoId).get();
	}
	

	public Curso save(final Curso c) {
		
	   Curso saved = this.cursoRepository.save(c);

		return saved;
	}
	
}
