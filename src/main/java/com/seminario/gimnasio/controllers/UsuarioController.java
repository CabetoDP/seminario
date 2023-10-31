package com.seminario.gimnasio.controllers;

import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.services.contracts.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/list")
    private ResponseEntity<List<Usuario>> getAllUsuarios() {
        return this.usuarioService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.create(usuario);
    }

    @PutMapping("/update")
    private ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.update(usuario);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteUsuario(@RequestParam Long id) {
        return this.usuarioService.delete(id);
    }
}