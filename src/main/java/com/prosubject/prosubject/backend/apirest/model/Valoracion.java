package com.prosubject.prosubject.backend.apirest.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Table(name="VALORACION")
@Entity
public class Valoracion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String comentario;
	
	@NotNull
	@Range(min = 0, max = 5)
	private Integer valoracion;

	@Valid
	@OneToMany
	private Collection<Persona>	alumnos;

	public Collection<Persona> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Collection<Persona> alumnos) {
		this.alumnos = alumnos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}
	
	

}
