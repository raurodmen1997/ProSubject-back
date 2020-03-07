package com.prosubject.prosubject.backend.apirest.model;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Valid
	@OneToOne
	private UserAccount userAccount;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	private String apellidos;
	
	@NotBlank
	private String dni;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String telefono;
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public UserAccount getUserAccount() {
		return userAccount;
	}



	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
