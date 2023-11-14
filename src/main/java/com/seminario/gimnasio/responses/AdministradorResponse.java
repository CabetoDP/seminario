package com.seminario.gimnasio.responses;

public class AdministradorResponse {

    public long id, id_usuario_id;

    public AdministradorResponse(long id, long id_usuario_id) {
        this.id = id;
        this.id_usuario_id = id_usuario_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_usuario_id() {
        return id_usuario_id;
    }

    public void setId_usuario_id(long id_usuario_id) {
        this.id_usuario_id = id_usuario_id;
    }
}
