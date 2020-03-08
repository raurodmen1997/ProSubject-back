package com.prosubject.prosubject.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prosubject.prosubject.backend.apirest.model.Espacio;

@Repository
public interface EspacioRepository extends JpaRepository<Espacio, Long> {
	
	@Query("select e from espacios e where e.id=?1")
	Espacio findOneById(long id);
}
