package co.com.sofka.tienda.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroVideojuegos implements ValueObject<String> {

    private final String numeroVideojuegos;

    public NumeroVideojuegos(String numeroVideojuegos) {
        this.numeroVideojuegos = Objects.requireNonNull(numeroVideojuegos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroVideojuegos that = (NumeroVideojuegos) o;
        return Objects.equals(numeroVideojuegos, that.numeroVideojuegos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroVideojuegos);
    }

    @Override
    public String value() {
        return null;
    }
}
