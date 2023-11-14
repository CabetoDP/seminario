package com.seminario.gimnasio.controllers;

import com.seminario.gimnasio.entities.Administrador;
import com.seminario.gimnasio.requests.LoginRequest;
import com.seminario.gimnasio.services.contracts.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administradores")
public class AdministradorController {

    @Autowired
    private IAdministradorService administradorService;

    @GetMapping("/list")
    private ResponseEntity<List<Administrador>> getAllAdministrador() {
        return this.administradorService.findAll();
    }

    @PostMapping("/create")
    private  ResponseEntity<Administrador> createAdministrador(@RequestBody Administrador administrador) {
        return this.administradorService.create(administrador);
    }

    @PutMapping("/update")
    private ResponseEntity<Administrador> updateCliente(@RequestBody Administrador administrador) {
        return this.administradorService.update(administrador);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteCliente(@RequestParam Long id) {
        return this.administradorService.delete(id);
    }

    @PostMapping("/show")
    private ResponseEntity<Administrador> show(@RequestBody LoginRequest login) {
        return this.administradorService.show(login.correo, login.contraseña);
    }

    /* @PostMapping("/showProfile")
    private ResponseEntity<AdministradorResponse> showProfile(@RequestParam long id) {
        return this.administradorService.showProfile(id);
    }
    */
    
    
}
