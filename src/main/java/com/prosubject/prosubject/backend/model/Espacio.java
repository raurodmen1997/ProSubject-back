package com.prosubject.prosubject.backend.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Espacio implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	private long id;
	
	@ManyToMany
	private Collection<Persona> alumnos;
	
	@OneToOne
	private Asignatura asignatura;
	
	@OneToOne
	private Foro foro;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Persona> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Collection<Persona> alumnos) {
		this.alumnos = alumnos;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Foro getForo() {
		return foro;
	}

	public void setForo(Foro foro) {
		this.foro = foro;
	}
	
	
	
	
	
}
