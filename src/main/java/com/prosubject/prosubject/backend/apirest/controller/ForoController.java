package com.prosubject.prosubject.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosubject.prosubject.backend.apirest.model.Foro;
import com.prosubject.prosubject.backend.apirest.service.ForoService;

@RestController
@RequestMapping("/api/foros")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ForoController {

	@Autowired
	private ForoService foroService;
	
	@GetMapping("")
	public List<Foro> findAll(){
		return this.foroService.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Foro findOne(@PathVariable Long id){
		return this.foroService.findOne(id);
		
	}
	
	@PostMapping("")
	public Foro crearEspacio(@RequestBody Foro foro ) {
		Foro f = new Foro();
		try {
			f = this.foroService.save(foro);
			
		}catch(Exception ex){
			
		}
		
		return f;
		
	}
	
}
