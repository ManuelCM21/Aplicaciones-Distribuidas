package com.example.catalogo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productoId;
    private String productoName;
}
