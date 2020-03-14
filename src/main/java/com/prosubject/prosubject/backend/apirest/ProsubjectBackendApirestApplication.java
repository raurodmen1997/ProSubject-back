package com.prosubject.prosubject.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prosubject.prosubject.backend.apirest.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ProsubjectBackendApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProsubjectBackendApirestApplication.class, args);
	}

}
