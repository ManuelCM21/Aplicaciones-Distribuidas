package com.example.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.catalogo.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
