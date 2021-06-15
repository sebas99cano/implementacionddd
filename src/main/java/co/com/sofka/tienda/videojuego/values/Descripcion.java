package co.com.sofka.tienda.videojuego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion) {
        if(descripcion.length()<5){
            throw new IllegalArgumentException("El numero de caracteres de descripcion no puede ser menor a 5");
        }
        if(descripcion.length()>200){
            throw new IllegalArgumentException("El numero de caracteres de descripcion no puede ser mayor a 200");
        }
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }

    @Override
    public String value() {
        return null;
    }
}
