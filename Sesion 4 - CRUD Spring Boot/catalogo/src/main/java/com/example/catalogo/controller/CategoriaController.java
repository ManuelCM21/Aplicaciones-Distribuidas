package com.example.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.catalogo.entity.Categoria;
import com.example.catalogo.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public List<Categoria> listar() { // public ResponseEntity<List<Categoria>> list()
        return categoriaService.listar(); // return ResponseEntity.ok().body(categoriaService.listar());
    }

    @PostMapping()
    public Categoria guardar(@RequestBody Categoria categoria) {
        return categoriaService.guardar(categoria);
    }

    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable(required = true) Integer id) {
        return categoriaService.listarPorId(id).get();
    }

    @PutMapping()
    public Categoria actualizar(@RequestBody Categoria categoria) {
        return categoriaService.actualizar(categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(required = true) Integer id) {
        categoriaService.eliminarPorId(id);
    }
}