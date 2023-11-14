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

import com.seminario.gimnasio.entities.ContratoGimnasio;
import com.seminario.gimnasio.services.contracts.IContratoGimnasioService;

@RestController
@RequestMapping("/contratosGimnasio")
public class ContratoGimnasioController {

    @Autowired
    private IContratoGimnasioService contratoGimnasioService;

    @GetMapping("/list")
    private ResponseEntity<List<ContratoGimnasio>> getAllContratosGimnasio() {
        return this.contratoGimnasioService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<ContratoGimnasio> createContratoGimnasio(@RequestBody ContratoGimnasio contratoGimnasio) {
        return this.contratoGimnasioService.create(contratoGimnasio);
    }

    @PutMapping("/update")
    private ResponseEntity<ContratoGimnasio> updateContratoGimnasio(@RequestBody ContratoGimnasio contratoGimnasio) {
        return this.contratoGimnasioService.update(contratoGimnasio);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteContratGimnasio(@RequestParam Long id) {
        return this.contratoGimnasioService.delete(id);
    }
}
