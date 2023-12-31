package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.repositories.contracts.IUsuarioRepository;
import com.seminario.gimnasio.responses.LoginResponse;
import com.seminario.gimnasio.responses.UsuarioResponse;
//import com.seminario.gimnasio.requests.LoginRequest;
import com.seminario.gimnasio.services.contracts.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public ResponseEntity<List<Usuario>> findAll() {
        try {
            List<Usuario> usuarios = this.usuarioRepository.findAll();
            return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Usuario> create(Usuario usuario) {
        try {
            Usuario usuarioSaved = this.usuarioRepository.save(usuario);
            return new ResponseEntity<Usuario>(usuarioSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Usuario> update(Usuario usuario) {
        try {
            Usuario usuarioUpdated = this.usuarioRepository.save(usuario);
            return new ResponseEntity<Usuario>(usuarioUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.usuarioRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<LoginResponse> validate (String correo, String contraseña) {

        Usuario usuario = this.usuarioRepository.encontrar(correo, contraseña);
        String tipoUsuario = this.usuarioRepository.mostrarTipo(correo, contraseña);

        LoginResponse validacionUsuario = new LoginResponse(tipoUsuario, false);

        try {
            
            if (usuario == null) {
                // El usuario no fue encontrado en la base de datos
                return new ResponseEntity<LoginResponse>(validacionUsuario, HttpStatus.OK);
            }
            // Validar la contraseña
            if (usuario.getContraseña().equals(contraseña)) {
                // Contraseña válida, inicio de sesión exitoso
                validacionUsuario.setValidacion(true);
                return new ResponseEntity<LoginResponse>(validacionUsuario, HttpStatus.OK);
            } 
            else {
                // Contraseña incorrecta
                return new ResponseEntity<LoginResponse>(validacionUsuario, HttpStatus.OK);
            }
        }
        catch (EmptyResultDataAccessException e) {
            // Manejar la excepción cuando no se encuentra el usuario
            return new ResponseEntity<LoginResponse>(validacionUsuario, HttpStatus.UNAUTHORIZED);
        }
    }

    @Override
    public ResponseEntity<Usuario> show (String correo, String contraseña){
        Usuario usuario = this.usuarioRepository.mostrar(correo, contraseña);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UsuarioResponse> showProfile (Long id){
        Usuario usuario = this.usuarioRepository.mostrarPerfil(id);
        UsuarioResponse perfilUsuario = new UsuarioResponse(id, usuario.tipoUsuario, usuario.nombres, usuario.apellidos, usuario.celular, usuario.fechaDeNacimiento);
        return new ResponseEntity<UsuarioResponse>(perfilUsuario, HttpStatus.OK);
    }
    
    public ResponseEntity <List<UsuarioResponse>> listContacts (Long id){
        List<Usuario> usuarios = this.usuarioRepository.listarContactos(id);

        List<UsuarioResponse> contactos = new ArrayList<>();

        for (Usuario usuario : usuarios) {

            UsuarioResponse response = new UsuarioResponse(id, usuario.tipoUsuario, usuario.nombres, usuario.apellidos, usuario.celular, usuario.fechaDeNacimiento);
            contactos.add(response);
        }
        return new ResponseEntity<List<UsuarioResponse>>(contactos, HttpStatus.OK);
    }

    @Override
    public ResponseEntity <UsuarioResponse> search(String busqueda){
        UsuarioResponse usuario = this.usuarioRepository.buscar(busqueda);
        return new ResponseEntity<UsuarioResponse>(usuario, HttpStatus.OK);
    }

    @Override
    public ResponseEntity <List<UsuarioResponse>> listProfiles(){
        List<UsuarioResponse> usuarios = this.usuarioRepository.listar();
        return new ResponseEntity<List<UsuarioResponse>>(usuarios, HttpStatus.OK);
    }
}

