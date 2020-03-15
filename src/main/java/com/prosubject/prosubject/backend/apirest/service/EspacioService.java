package com.prosubject.prosubject.backend.apirest.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.prosubject.prosubject.backend.apirest.controller.HorarioController;
import com.prosubject.prosubject.backend.apirest.model.Alumno;
import com.prosubject.prosubject.backend.apirest.model.Asignatura;
import com.prosubject.prosubject.backend.apirest.model.Espacio;
import com.prosubject.prosubject.backend.apirest.model.Foro;
import com.prosubject.prosubject.backend.apirest.model.Horario;
import com.prosubject.prosubject.backend.apirest.model.Profesor;
import com.prosubject.prosubject.backend.apirest.repository.EspacioRepository;

@Service
public class EspacioService {
	@Autowired
	private EspacioRepository espacioRepository;
	@Autowired
	private ForoService foroService;
	@Autowired
	private AlumnoService alumnoService;
	@Autowired
	private HorarioService horarioService;
	@Autowired
	private AsignaturaService asignaturaService;
	@Autowired
	private ProfesorService profesorService;
	public List<Espacio> findAll() {
		return this.espacioRepository.findAll();
	}
	
	public List<Espacio> findDisponibles(String universidad, 
			String facultad, String curso, String asignatura){
		return this.espacioRepository.findDisponibles(universidad, facultad, curso, asignatura);
	}
	
	public Espacio findOne(final long espacioId){
		return this.espacioRepository.findById(espacioId).orElse(null);
	}
	
public Espacio save(final Espacio e) throws Exception {
		
		
		if(e.getId()==null) {
			
			Collection<Alumno> alumnos =new HashSet<Alumno>();
			
			Foro f = new Foro();
			f.setTitulo("Foro "+e.getAsignatura().getNombre());			
			Foro fSaved= this.foroService.save(f);
			
			Collection<Horario> horarios = e.getHorarios();
			Collection<Horario> horariosGuardados =  new HashSet<Horario>();
			
			for (Horario horario : horarios) {
				
				Horario hSaved =this.horarioService.save(horario);
				horariosGuardados.add(hSaved);
			} 
			
			e.setHorarios(horariosGuardados);
			e.setForo(fSaved);
			e.setAlumnos(alumnos);

			
		}
		
		
		return this.espacioRepository.save(e);
}
		
	//Metodo para inscribir un alumno en un espacio
	public Espacio añadirAlumno(final long alumnoId , final long espacioId) throws Exception{
		Alumno a = this.alumnoService.findOne(alumnoId);
		Espacio e = this.findOne(espacioId);
		Collection<Alumno> alumnos = e.getAlumnos();
		Assert.isTrue(!(alumnos.contains(a)));
		Assert.isTrue(e.getCapacidad()>e.getAlumnos().size());
		alumnos.add(a);
		e.setAlumnos(alumnos);
		this.save(e);
		
		return e;
		
	}

        //Listado de espacios creados por un profesor
	public List<Espacio> espaciosDeUnProfesor(Long id){
		return this.espacioRepository.espaciosDeUnProfesor(id);
	}
	
	//Listado de espacios en los que estas inscrito un alumno
		public List<Espacio> espaciosDeUnAlumno(Long id){
			return this.espacioRepository.espaciosDeUnAlumno(id);
	}
	
	//Listado de espacios creados por un profesor
	public List<Espacio> espaciosDeUnProfesor(Long id){
		return this.espacioRepository.espaciosDeUnProfesor(id);
	}
	
	//Listado de espacios en los que estas inscrito un alumno
		public List<Espacio> espaciosDeUnAlumno(Long id){
			return this.espacioRepository.espaciosDeUnAlumno(id);
		}
	
	
	
}

