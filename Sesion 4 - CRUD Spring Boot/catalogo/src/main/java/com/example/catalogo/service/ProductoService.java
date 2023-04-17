package com.example.catalogo.service;

import java.util.List;
import java.util.Optional;

import com.example.catalogo.entity.Producto;

public interface ProductoService {
    public List<Producto> listar();

    public Producto guardar(Producto producto);

    public Producto actualizar(Producto producto);

    public Optional<Producto> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
