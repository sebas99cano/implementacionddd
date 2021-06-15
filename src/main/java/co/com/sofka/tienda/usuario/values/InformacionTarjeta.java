package co.com.sofka.tienda.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Objects;

public class InformacionTarjeta implements ValueObject<ArrayList<String>> {

    private final ArrayList<String> informacionTarjeta;

    public InformacionTarjeta(ArrayList<String> informacionTarjeta) {
        this.informacionTarjeta = Objects.requireNonNull(informacionTarjeta);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformacionTarjeta that = (InformacionTarjeta) o;
        return Objects.equals(informacionTarjeta, that.informacionTarjeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(informacionTarjeta);
    }

    @Override
    public ArrayList<String> value() {
        return null;
    }
}
