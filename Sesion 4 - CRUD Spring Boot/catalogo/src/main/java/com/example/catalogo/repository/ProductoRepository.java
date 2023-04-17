package com.example.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.catalogo.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
