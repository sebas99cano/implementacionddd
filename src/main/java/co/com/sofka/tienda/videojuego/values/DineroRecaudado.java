package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DineroRecaudado implements ValueObject<String> {

    private final String dineroRecaudado;

    public DineroRecaudado(String dineroRecaudado) {
        this.dineroRecaudado = Objects.requireNonNull(dineroRecaudado);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DineroRecaudado that = (DineroRecaudado) o;
        return Objects.equals(dineroRecaudado, that.dineroRecaudado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dineroRecaudado);
    }

    @Override
    public String value() {
        return null;
    }
}
