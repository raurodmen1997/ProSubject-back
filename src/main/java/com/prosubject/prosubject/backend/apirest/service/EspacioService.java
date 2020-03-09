package com.prosubject.prosubject.backend.apirest.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.prosubject.prosubject.backend.apirest.model.Alumno;
import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.model.Foro;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;
import com.prosubject.prosubject.backend.apirest.repository.ForoRepository;

@Service
public class EspacioService {
	@Autowired
	private EspacioRepository espacioRepository;
	@Autowired
	private ForoService foroService;
	@Autowired
	private AlumnoService alumnoService;
	
	
	public List<Espacio> findAll() {
		return this.espacioRepository.findAll();
	}
	
	public Espacio findOne(final long espacioId){
		return this.espacioRepository.findById(espacioId).orElse(null);
	}
	
	public Espacio save(final Espacio e) {
		if(e.getId()==null) {
			this.foroService.save(e.getForo());
		}
		Assert.isTrue(e.getCapacidad()>=e.getAlumnos().size());
		return this.espacioRepository.save(e);
		
		
	}
	//Metodo para inscribir un alumno en un espacio
	public Espacio añadirAlumno(final long alumnoId , final long espacioId){
		Alumno a = this.alumnoService.findOne(alumnoId);
		Espacio e = this.findOne(espacioId);
		Collection<Alumno> alumnos = e.getAlumnos();
		Assert.isTrue(!(alumnos.contains(a)));
		Assert.isTrue(e.getCapacidad()>e.getAlumnos().size());
		alumnos.add(a);
		e.setAlumnos(alumnos);
		this.save(e);
		
		return e;
		
	}
	
	
	
}

