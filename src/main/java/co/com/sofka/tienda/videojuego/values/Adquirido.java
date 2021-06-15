package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.ValueObject;

public class Adquirido implements ValueObject<Boolean> {
    @Override
    public Boolean value() {
        return false;
    }
}
