package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Adquirido implements ValueObject<Boolean> {

    private final Boolean adquirido;

    public Adquirido(Boolean adquirido) {
        this.adquirido = adquirido;
    }

    @Override
    public Boolean value() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adquirido adquirido1 = (Adquirido) o;
        return Objects.equals(adquirido, adquirido1.adquirido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adquirido);
    }
}
