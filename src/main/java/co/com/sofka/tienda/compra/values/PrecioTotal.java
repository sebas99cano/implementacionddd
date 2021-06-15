package co.com.sofka.tienda.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PrecioTotal implements ValueObject<Float> {

    private final float precioTotal;

    public PrecioTotal(float precioTotal) {
        if(precioTotal < 0){
            throw new IllegalArgumentException("El precio total no puede ser negativo");
        }
        if(precioTotal > 99999999){
            throw new IllegalArgumentException("El precio total no puede ser mayor a 99999999");
        }
        this.precioTotal = Objects.requireNonNull(precioTotal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrecioTotal that = (PrecioTotal) o;
        return Float.compare(that.precioTotal, precioTotal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioTotal);
    }

    @Override
    public Float value() {
        return null;
    }
}
