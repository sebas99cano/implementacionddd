package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.Identity;

public class IdDesarrollador extends Identity {
    public IdDesarrollador(String uuid) {
        super(uuid);
    }

    public IdDesarrollador() {
    }

    public static IdDesarrollador of(String id){
        return new IdDesarrollador(id);
    }
}
