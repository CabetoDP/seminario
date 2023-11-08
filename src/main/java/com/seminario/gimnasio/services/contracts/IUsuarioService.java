package com.seminario.gimnasio.services.contracts;
//import com.seminario.gimnasio.requests.LoginRequest;
import com.seminario.gimnasio.entities.Usuario;
import com.seminario.gimnasio.responses.LoginResponse;
import com.seminario.gimnasio.responses.UsuarioResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUsuarioService {
    public ResponseEntity<List<Usuario>> findAll();

    public ResponseEntity<Usuario> create(Usuario usuario);

    public ResponseEntity<Usuario> update(Usuario usuario);

    public ResponseEntity<Boolean> delete(Long id);

    public ResponseEntity<LoginResponse> validate (String correo, String contraseña);

    public ResponseEntity <Usuario> show(String correo, String contraseña);
    
    public ResponseEntity <UsuarioResponse> showProfile(Long id);

    public ResponseEntity <List<UsuarioResponse>> listContacts (Long id);

    public ResponseEntity <UsuarioResponse> search(String busqueda);

    public ResponseEntity <List<UsuarioResponse>> listProfiles();
}
