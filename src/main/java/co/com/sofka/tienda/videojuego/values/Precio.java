package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<String> {

    private final String precio;

    public Precio(String precio) {
        this.precio = Objects.requireNonNull(precio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio precio1 = (Precio) o;
        return Objects.equals(precio, precio1.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }

    @Override
    public String value() {
        return null;
    }
}
