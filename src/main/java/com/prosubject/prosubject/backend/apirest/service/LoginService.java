package com.prosubject.prosubject.backend.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prosubject.prosubject.backend.apirest.model.Administrador;
import com.prosubject.prosubject.backend.apirest.model.Alumno;
import com.prosubject.prosubject.backend.apirest.model.Authority;
import com.prosubject.prosubject.backend.apirest.model.Profesor;
import com.prosubject.prosubject.backend.apirest.model.UserAccount;
import com.prosubject.prosubject.backend.apirest.repository.UserAccountRepository;

@Service
public class LoginService {

	@Autowired
	private UserAccountRepository userAccountRepository;

	public Long logearse(final String usuario, final String password) {

		UserAccount a = this.userAccountRepository.cuentaLogueada(usuario, password);
		if (a == null) {
			return null;
		} else {
			return a.getId();
		}
	}

}
