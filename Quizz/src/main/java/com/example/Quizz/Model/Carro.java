package com.example.Quizz.Model;

import jakarta.persistence.*;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricula;
    private String marca;
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Carro() {
    }

    public Carro(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String matricula, String marca, String modelo, Persona persona) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.persona = persona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}