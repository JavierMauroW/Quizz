package com.example.Quizz.Service;

import com.example.Quizz.Model.Persona;
import com.example.Quizz.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public boolean delete(Long id) {
        if (personaRepository.existsById(id)) {
            personaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}