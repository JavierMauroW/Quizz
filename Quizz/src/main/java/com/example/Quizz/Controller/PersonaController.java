package com.example.Quizz.Controller;

import com.example.Quizz.Model.Persona;
import com.example.Quizz.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> findAll() {
        return personaService.findAll();
    }

    @PostMapping
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        Persona savedPersona = personaService.save(persona);
        return new ResponseEntity<>(savedPersona, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> findById(@PathVariable Long id) {
        Persona persona = personaService.findById(id);
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (personaService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}