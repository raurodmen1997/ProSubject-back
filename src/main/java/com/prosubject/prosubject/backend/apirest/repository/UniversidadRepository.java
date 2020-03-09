package com.prosubject.prosubject.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prosubject.prosubject.backend.apirest.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long>{

}
