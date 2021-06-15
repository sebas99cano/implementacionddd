package co.com.sofka.tienda.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {

    private final Date fecha;

    public Fecha(Date fecha) {
        this.fecha = Objects.requireNonNull(fecha);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha1 = (Fecha) o;
        return Objects.equals(fecha, fecha1.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }

    @Override
    public Date value() {
        return null;
    }
}
