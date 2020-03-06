package com.prosubject.prosubject.backend.apirest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.prosubject.prosubject.backend.apirest.enumerados.Curso;
import com.prosubject.prosubject.backend.apirest.enumerados.Universidad;


@Entity
@Table(name="ASIGNATURA")
public class Asignatura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3268504994644111092L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@NotBlank
	@Column(name="NOMBRE")
	private String nombre;
	
	@NotNull
	@Column(name="CURSO")
	private Curso curso;
	
	@NotNull
	@Column(name = "GRADO")
	private Grado grado;
	
	@NotNull
	@Column(name = "UNIVERSIDAD")
	private Universidad universidad;

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

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
	
	
}
