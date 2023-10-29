package com.seminario.gimnasio.services.implementations;
import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.repositories.contracts.IUsuarioRepository;
import com.seminario.gimnasio.services.contracts.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
}

