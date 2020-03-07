package com.prosubject.prosubject.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prosubject.prosubject.backend.apirest.model.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Integer> {

	@Query("select g from Grado g where g.id =?1")
	Grado findOnebyId(long id);



}
 

