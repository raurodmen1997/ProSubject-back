package com.prosubject.prosubject.backend.apirest.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
public class Espacio implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Valid
	@ManyToMany
	private Collection<Alumno> alumnos;
	
	@Valid
	@OneToOne
	private Asignatura asignatura;
	
	@Valid
	@OneToOne
	private Foro foro;
	
	@Valid
	@ManyToOne
	private Profesor profesor;
	
	@NotNull
	private Double Precio;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Collection<Alumno> alumnos) {
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

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}
	
	
	
	
	
	
	
	
	
}
