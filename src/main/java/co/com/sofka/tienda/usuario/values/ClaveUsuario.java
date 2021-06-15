package co.com.sofka.tienda.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ClaveUsuario implements ValueObject<String> {

    private final String claveUsuario;

    public ClaveUsuario(String claveUsuario) {
        if(claveUsuario.length()>20){
            throw new IllegalArgumentException("La clave de usuario no puede superar los 20 caracteres");
        }
        if(claveUsuario.length()<8){
            throw new IllegalArgumentException("La clave de usuario no puede ser inferior a los 8 caracteres");
        }
        this.claveUsuario = Objects.requireNonNull(claveUsuario);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaveUsuario that = (ClaveUsuario) o;
        return Objects.equals(claveUsuario, that.claveUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claveUsuario);
    }

    @Override
    public String value() {
        return null;
    }
}
