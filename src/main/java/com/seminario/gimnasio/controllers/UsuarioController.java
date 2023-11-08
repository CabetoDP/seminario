package com.seminario.gimnasio.controllers;
import com.seminario.gimnasio.requests.LoginRequest;
import com.seminario.gimnasio.responses.LoginResponse;
import com.seminario.gimnasio.responses.UsuarioResponse;
import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.services.contracts.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping("/validate")
    private ResponseEntity<LoginResponse> validate(@RequestBody LoginRequest login) {
        return this.usuarioService.validate(login.correo, login.contraseña);
    }

    @PostMapping("/show")
    private ResponseEntity<Usuario> show(@RequestBody LoginRequest login) {
        return this.usuarioService.show(login.correo, login.contraseña);
    }
    
    @PostMapping("/showProfile")
    private ResponseEntity<UsuarioResponse> showProfile(@RequestBody long id) {
        return this.usuarioService.showProfile(id);
    }

    @PostMapping("/listContacts")
    private ResponseEntity <List<UsuarioResponse>> listContacts (Long id){
        return this.usuarioService.listContacts(id);
    }

    @PostMapping("/search")
    private ResponseEntity <UsuarioResponse> search (String busqueda){
        return this.usuarioService.search(busqueda);
    }

    @GetMapping ("/listProfiles")
    private ResponseEntity <List <UsuarioResponse>> listProfiles (){
        return this.usuarioService.listProfiles();
    }

}
