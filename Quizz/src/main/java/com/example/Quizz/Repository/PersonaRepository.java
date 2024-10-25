package com.example.Quizz.Repository;

import com.example.Quizz.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}