package com.example.Quizz.Repository;



import com.example.Quizz.Model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}