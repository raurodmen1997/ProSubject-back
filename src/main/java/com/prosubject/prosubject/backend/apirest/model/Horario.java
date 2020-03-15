package com.prosubject.prosubject.backend.apirest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "horario")
public class Horario implements Serializable{
	
	
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date fechaInicio;
	
	@NotNull
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date fechaFin;
	
	@NotNull
	private DiaSemana dia;


	public Date getFechaInicio() {
		
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}


		 
}
