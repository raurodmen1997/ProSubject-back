package com.prosubject.prosubject.backend.apirest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prosubject.prosubject.backend.apirest.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String username);
}

