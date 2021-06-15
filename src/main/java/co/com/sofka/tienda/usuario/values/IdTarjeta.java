package co.com.sofka.tienda.usuario.values;

import co.com.sofka.domain.generic.Identity;

public class IdTarjeta extends Identity {

    public IdTarjeta(String id) {
        super(id);
    }

    public IdTarjeta() {
    }

    public static IdTarjeta of(String id){
        return new IdTarjeta(id);
    }
}
