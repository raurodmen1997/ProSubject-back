package com.prosubject.prosubject.backend.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prosubject.prosubject.backend.apirest.model.Administrador;
import com.prosubject.prosubject.backend.apirest.model.Alumno;
import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.model.Profesor;
import com.prosubject.prosubject.backend.apirest.model.UserAccount;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long>  {
	
	@Query("select u from useraccounts u where u.username=?1 AND u.password=?2")
	UserAccount cuentaLogueada(String usuario, String password);
	
	@Query("select p from profesores p join p.useraccount u where u.id=?1")
	Profesor findProfesorByUserAccountId(Long id);
	
	@Query("select p from alumnos p join p.useraccount u where u.id=?1")
	Alumno findAlumnoByUserAccountId(Long id);
	
	@Query("select p from administradores p join p.useraccount u where u.id=?1")
	Administrador findAdministradorByUserAccountId(Long id);

}
