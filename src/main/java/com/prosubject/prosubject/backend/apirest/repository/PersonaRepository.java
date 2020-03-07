package com.prosubject.prosubject.backend.apirest.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prosubject.prosubject.backend.apirest.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

	@Query("select p from persona were p.id=?1")
	Persona findOneById(long id);
	List<Persona> findAll();
}
