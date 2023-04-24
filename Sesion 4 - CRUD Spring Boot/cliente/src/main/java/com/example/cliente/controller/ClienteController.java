package com.example.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.cliente.entity.Cliente;
import com.example.cliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<Cliente> listar() { // public ResponseEntity<List<Categoria>> list()
        return clienteService.listar(); // return ResponseEntity.ok().body(categoriaService.listar());
    }

    @PostMapping()
    public Cliente guardar(@RequestBody Cliente cliente) {
        return clienteService.guardar(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable(required = true) Integer id) {
        return clienteService.listarPorId(id).get();
    }

    @PutMapping()
    public Cliente actualizar(@RequestBody Cliente cliente) {
        return clienteService.actualizar(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(required = true) Integer id) {
        clienteService.eliminarPorId(id);
    }
}