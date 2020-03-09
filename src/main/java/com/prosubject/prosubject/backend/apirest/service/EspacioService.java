package com.prosubject.prosubject.backend.apirest.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prosubject.prosubject.backend.apirest.model.Alumno;
import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;

@Service
public class EspacioService {
	@Autowired
	private EspacioRepository espacioRepository;
	@Autowired
	private AlumnoService alumnoService;
	
	
	public List<Espacio> findAll() {
		return this.espacioRepository.findAll();
	}
	
	public Espacio findOne(final long espacioId){
		return this.espacioRepository.findById(espacioId).orElse(null);
	}
	
	public Espacio save(final Espacio e) {
		return this.espacioRepository.save(e);
		
		
	}
	//Metodo para inscribir un alumno en un espacio
	public Espacio añadirAlumno(final long alumnoId , final long espacioId){
		Alumno a = this.alumnoService.findOne(alumnoId);
		Espacio e = this.findOne(espacioId);
		Collection<Alumno> alumnos = e.getAlumnos();
		alumnos.add(a);
		e.setAlumnos(alumnos);
		this.save(e);
		return e;
		
	}
	
	
}

