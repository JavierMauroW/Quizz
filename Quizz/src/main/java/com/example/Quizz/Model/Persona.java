package com.example.Quizz.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Carro> carros; // Cambié el nombre de 'coches' a 'coches'

    public Persona() {
    }

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Carro> getCarros() {
        return carros;
    }

    public void setCarros(Set<Carro> coches) {
        this.carros = coches;
    }
}