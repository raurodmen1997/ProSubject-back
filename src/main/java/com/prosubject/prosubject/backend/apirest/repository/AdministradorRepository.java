package com.prosubject.prosubject.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prosubject.prosubject.backend.apirest.model.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long>  {
	
	
	
	

}
