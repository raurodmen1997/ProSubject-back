package com.prosubject.prosubject.backend.apirest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BasicAuthController {

	@GetMapping(path = "/")
    public String home() {
        return ("<h1>Welcome<h1>");
    }
	
	@GetMapping(path = "/user")
    public String homeLogged() {
        return ("<h1>You are authenticated<h1>");
    }
	
	
}