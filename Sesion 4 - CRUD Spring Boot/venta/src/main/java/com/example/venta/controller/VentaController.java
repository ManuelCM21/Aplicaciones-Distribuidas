package com.example.venta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.venta.entity.Venta;
import com.example.venta.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping()
    public List<Venta> listar() { // public ResponseEntity<List<Categoria>> list()
        return ventaService.listar(); // return ResponseEntity.ok().body(categoriaService.listar());
    }

    @PostMapping()
    public Venta guardar(@RequestBody Venta venta) {
        return ventaService.guardar(venta);
    }

    @GetMapping("/{id}")
    public Venta buscarPorId(@PathVariable(required = true) Integer id) {
        return ventaService.listarPorId(id).get();
    }

    @PutMapping()
    public Venta actualizar(@RequestBody Venta venta) {
        return ventaService.actualizar(venta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(required = true) Integer id) {
        ventaService.eliminarPorId(id);
    }
}