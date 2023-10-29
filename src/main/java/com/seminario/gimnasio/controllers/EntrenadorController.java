package com.seminario.gimnasio.controllers;

import com.seminario.gimnasio.entities.Entrenador;
import com.seminario.gimnasio.services.contracts.IEntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {

    @Autowired
    private IEntrenadorService entrenadorService;

    @GetMapping("/list")
    private ResponseEntity<List<Entrenador>> getAllEntrenadores() {
        return this.entrenadorService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<Entrenador> createUsuario(@RequestBody Entrenador entrenador) {
        return this.entrenadorService.create(entrenador);
    }

    @PutMapping("/update")
    private ResponseEntity<Entrenador> updateUsuario(@RequestBody Entrenador entrenador) {
        return this.entrenadorService.update(entrenador);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteEntrenador(@RequestParam Long id) {
        return this.entrenadorService.delete(id);
    }
}
