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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.prosubject.prosubject.backend.apirest.enumerados.Universidad;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
	public Persona() {
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank
	@Column(name = "nombre")
	private String nombre;
	
	@NotBlank
	@Column(name = "apellidos")
	private String apellidos;
	
	@NotBlank
	@Column(name = "dni")
	private String dni;
	
	@NotBlank
	@Column(name = "email")
	private String email;
	
	@NotBlank
	@Column(name = "telefono")
	private String telefono;
	
	@NotNull
	@Column(name = "grado")
	private Grado grado;
	
	@NotNull
	@Column(name = "universidad")
	private Universidad universidad;
	
	@OneToMany
	@Column(name = "espacios")
	private Collection<Espacio> espacios;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Collection<Espacio> getEspacios() {
		return espacios;
	}



	public void setEspacios(Collection<Espacio> espacios) {
		this.espacios = espacios;
	}
	

}
