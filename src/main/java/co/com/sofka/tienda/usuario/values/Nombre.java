package co.com.sofka.tienda.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String nombre;

    public Nombre(String nombre) {
        if(nombre.length()>100){
            throw new IllegalArgumentException("El nombre no puede superar los 100 caracteres");
        }
        if(nombre.length()<3){
            throw new IllegalArgumentException("El nombre no puede ser inferior a los 3 caracteres");
        }
        this.nombre = Objects.requireNonNull(nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre1 = (Nombre) o;
        return Objects.equals(nombre, nombre1.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String value() {
        return null;
    }
}
