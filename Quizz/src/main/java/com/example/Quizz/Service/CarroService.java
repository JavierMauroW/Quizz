package com.example.Quizz.Service;

import com.example.Quizz.Model.Carro;
import com.example.Quizz.Repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    // Cambia el método a no estático
    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro findById(Long id) {
        return carroRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        carroRepository.deleteById(id);
    }
}