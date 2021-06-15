package co.com.sofka.tienda.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Porcentaje implements ValueObject<Integer> {

    private final Integer porcentaje;

    public Porcentaje(Integer porcentaje) {

        if(porcentaje>100){
            throw new IllegalArgumentException("El porcentaje no puede ser superior al 100 %");
        }

        if(porcentaje<0){
            throw new IllegalArgumentException("El porcentaje no puede tener valores negativos");
        }

        this.porcentaje = Objects.requireNonNull(porcentaje);
    }

    @Override
    public Integer value() {
        return null;
    }
}
