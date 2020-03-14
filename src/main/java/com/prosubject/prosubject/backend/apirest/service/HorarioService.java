package com.prosubject.prosubject.backend.apirest.service;
import java.util.Date;
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
	
	private boolean checkHoraInicioValid(Horario horario) throws Exception {
		Date hoy = new Date();
		if ( !horario.getFechaInicio().after(hoy) && !horario.getFechaInicio().before(horario.getFechaFin())) {
			throw new Exception("La fecha de inicio debe ser posterior a hoy ");
		}
		return true;
	}
	
	private boolean checkHoraFinValid(Horario horario) throws Exception {
		
		if ( (!horario.getFechaFin().after(horario.getFechaInicio()))) {
			throw new Exception("La fecha de inicio debe ser posterior a la fecha de inicio");
		}
		return true;
	}

	public Horario save(Horario a) throws Exception{
		if(checkHoraInicioValid(a)&& checkHoraFinValid(a)) {
			a = this.horarioRepository.save(a);
		}
		
		return a;
	}

	
}
