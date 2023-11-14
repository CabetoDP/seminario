package com.seminario.gimnasio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seminario.gimnasio.entities.ContratoEntrenador;
import com.seminario.gimnasio.services.contracts.IContratoEntrenadorService;


@RestController
@RequestMapping("/contratosEntrenador")
public class ContratoEntrenadorController {

    @Autowired
    private IContratoEntrenadorService contratoEntrenadorService;

    @GetMapping("/list")
    private ResponseEntity<List<ContratoEntrenador>> getAllContratosEntrenador() {
        return this.contratoEntrenadorService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<ContratoEntrenador> createContratoEntrenador(@RequestBody ContratoEntrenador contratoEntrenador) {
        return this.contratoEntrenadorService.create(contratoEntrenador);
    }

    @PutMapping("/update")
    private ResponseEntity<ContratoEntrenador> updateContratoEntrenador(@RequestBody ContratoEntrenador contratoEntrenador) {
        return this.contratoEntrenadorService.update(contratoEntrenador);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteContratEntrenador(@RequestParam Long id) {
        return this.contratoEntrenadorService.delete(id);
    }
}
