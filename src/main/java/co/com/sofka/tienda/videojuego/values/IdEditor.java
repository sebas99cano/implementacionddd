package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.Identity;

public class IdEditor extends Identity {
    public IdEditor(String uuid) {
        super(uuid);
    }

    public IdEditor() {
    }

    public static IdEditor of(String id){
        return new IdEditor(id);
    }
}
