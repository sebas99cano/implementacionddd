package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroVentas implements ValueObject<String> {

    private final String numeroVentas;

    public NumeroVentas(String numeroVentas) {
        this.numeroVentas = Objects.requireNonNull(numeroVentas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroVentas that = (NumeroVentas) o;
        return Objects.equals(numeroVentas, that.numeroVentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroVentas);
    }

    @Override
    public String value() {
        return null;
    }
}
