package com.prosubject.prosubject.backend.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="FORO")
@Entity
public class Foro implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	
	@Column(name="COMENTARIOS")
	public List<String> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}
	private List<String> comentarios;
}
