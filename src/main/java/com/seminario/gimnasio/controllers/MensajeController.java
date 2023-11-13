package com.seminario.gimnasio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.seminario.gimnasio.entities.Mensaje;
import com.seminario.gimnasio.requests.ChatRequest;
import com.seminario.gimnasio.services.contracts.IMensajeService;


@RestController
@RequestMapping("/mensajes")
public class MensajeController {

    @Autowired
    private IMensajeService mensajeService;

    @GetMapping("/list")
    private ResponseEntity<List<Mensaje>> getAllMensajes() {
        return this.mensajeService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<Mensaje> createmensaje(@RequestBody Mensaje mensaje) {
        return this.mensajeService.create(mensaje);
    }

    @PutMapping("/update")
    private ResponseEntity<Mensaje> updateMensaje(@RequestBody Mensaje mensaje) {
        return this.mensajeService.update(mensaje);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteMensaje(@RequestParam Long id) {
        return this.mensajeService.delete(id);
    }

    @PostMapping("/chatBetweenUsers")
    private ResponseEntity<List<Mensaje>> chatBetweenUsers(@RequestParam ChatRequest chat) {
        return this.mensajeService.chatBetweenUsers(chat.correoLogeado, chat.contraseñaLogeado, chat.id);
    }
}
