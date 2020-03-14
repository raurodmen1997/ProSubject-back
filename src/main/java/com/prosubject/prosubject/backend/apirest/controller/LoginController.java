package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Administrador;
import com.prosubject.prosubject.backend.apirest.model.Alumno;
import com.prosubject.prosubject.backend.apirest.model.Authority;
import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.model.Profesor;
import com.prosubject.prosubject.backend.apirest.model.UserAccount;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;
import com.prosubject.prosubject.backend.apirest.repository.UserAccountRepository;


@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = { "http://localhost:4200" })
public class LoginController {

	@Autowired
	private UserAccountRepository userAccountRepository;

	@GetMapping("")
	public ResponseEntity<?> logearse(@RequestParam String username, @RequestParam String password) {
		Administrador administrador = null;
		Alumno alumno = null;
		Profesor profesor = null;
		

		UserAccount a = this.userAccountRepository.cuentaLogueada(username, password);
//		System.out.println(a.getAutoridad());
//		System.out.println(Authority.ADMIN);
		
		if (a == null) {
			return null;
		} else if (a.getAutoridad() == Authority.ADMIN) {
			administrador = this.userAccountRepository.findAdministradorByUserAccountId(a.getId());
			return new ResponseEntity<Administrador>(administrador, HttpStatus.OK);
		} else if (a.getAutoridad() == Authority.PROFESOR) {
			profesor = this.userAccountRepository.findProfesorByUserAccountId(a.getId());
			return new ResponseEntity<Profesor>(profesor, HttpStatus.OK);
		} else {
			alumno = this.userAccountRepository.findAlumnoByUserAccountId(a.getId());
			return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
		}

	}

}
