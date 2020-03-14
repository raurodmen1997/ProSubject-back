package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Administrador;
import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;
import com.prosubject.prosubject.backend.apirest.service.LoginService;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = {"http://localhost:4200"})
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("")
	public Long logearse(@RequestParam String username,@RequestParam String password){
		return this.loginService.logearse(username, password);
	}

}
