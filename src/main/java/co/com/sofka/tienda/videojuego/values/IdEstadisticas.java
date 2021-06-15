package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.Identity;

public class IdEstadisticas extends Identity {
    public IdEstadisticas(String uuid) {
        super(uuid);
    }

    public IdEstadisticas() {
    }

    public static IdEstadisticas of(String id){
        return new IdEstadisticas(id);
    }
}
