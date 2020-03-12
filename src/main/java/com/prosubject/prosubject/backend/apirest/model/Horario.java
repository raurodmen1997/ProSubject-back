package com.prosubject.prosubject.backend.apirest.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity(name = "horario")
public class Horario implements Serializable{
	
	
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	//@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Calendar fecha;
	
	@NotNull
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime hora;
	
	@NotNull
	private DayOfWeek dia;
	
	@Valid
	@OneToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "profesor_id")
	private Profesor profesor;
	
	//dayofWeek es un enumerado

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public DayOfWeek getDia() {
		return dia;
	}

	public void setDia(DayOfWeek dia) {
		this.dia = dia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
		 
}