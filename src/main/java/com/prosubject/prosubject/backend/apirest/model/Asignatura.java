package com.prosubject.prosubject.backend.apirest.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="ASIGNATURA")
public class Asignatura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String nombre;
	
	@Valid
	@ManyToOne
	private Curso curso;
	
	@Valid
	@ManyToMany
	private Collection<Grado> grado;
	
	@Valid
	@ManyToMany
	private Collection<Universidad> universidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Grado> getGrado() {
		return grado;
	}

	public void setGrado(Collection<Grado> grado) {
		this.grado = grado;
	}

	public Collection<Universidad> getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Collection<Universidad> universidad) {
		this.universidad = universidad;
	}


	
	
}
