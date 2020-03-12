package com.prosubject.prosubject.backend.apirest.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.prosubject.prosubject.backend.apirest.model.Horario;
import com.prosubject.prosubject.backend.apirest.repository.HorarioRepository;


@Service
public class HorarioService {
	@Autowired
	private HorarioRepository horarioRepository;
	
	
	public Horario create() {
		final Horario a = new Horario();
		return a;
	}
	
	public List<Horario> findAll() {
		return this.horarioRepository.findAll();
	}
	
	public Horario findOne(final long horarioId) {
		return this.horarioRepository.findById(horarioId).get();
	}
	

	public Horario save(final Horario a) {
		
	   Horario saved = this.horarioRepository.save(a);

		return saved;
	}

	
}
