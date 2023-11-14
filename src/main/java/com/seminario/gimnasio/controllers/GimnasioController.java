package com.seminario.gimnasio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.seminario.gimnasio.entities.Gimnasio;
import com.seminario.gimnasio.services.contracts.IGimnasioService;

@RestController
@RequestMapping("/gimnasios")
public class GimnasioController {

    @Autowired
    private IGimnasioService gimnasioService;

    @GetMapping("/list")
    private ResponseEntity<List<Gimnasio>> getAllGimnasios() {
        return this.gimnasioService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<Gimnasio> createGimnasio(@RequestBody Gimnasio gimnasio) {
        return this.gimnasioService.create(gimnasio);
    }

    @PutMapping("/update")
    private ResponseEntity<Gimnasio> updateGimnasio(@RequestBody Gimnasio gimnasio) {
        return this.gimnasioService.update(gimnasio);
    }


    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteGimnasio(@RequestParam Long id) {
        return this.gimnasioService.delete(id);
    }

    @PutMapping("/show")
    private ResponseEntity<Gimnasio> show(@RequestBody Gimnasio gimnasio) {
        return this.gimnasioService.update(gimnasio);
    }

    @PutMapping("/search")
    private ResponseEntity<Gimnasio> searchGimnasio(@RequestBody Gimnasio gimnasio) {
        return this.gimnasioService.update(gimnasio);
    }
  
}
