package com.example.Quizz.Controller;

import com.example.Quizz.Model.Carro;
import com.example.Quizz.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coches")
public class CarroController {
    private final CarroService carroService;

    @Autowired
    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping
    public List<Carro> findAll() {
        return carroService.findAll();
    }

    @PostMapping
    public Carro save(@RequestBody Carro carro) {
        return carroService.save(carro);
    }

    @GetMapping("/{id}")
    public Carro findById(@PathVariable Long id) {
        return carroService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carroService.delete(id);
    }
}