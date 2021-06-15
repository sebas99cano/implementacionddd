package co.com.sofka.tienda.usuario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tienda.usuario.values.ClaveUsuario;
import co.com.sofka.tienda.usuario.values.Correo;
import co.com.sofka.tienda.usuario.values.IdCuenta;
import co.com.sofka.tienda.usuario.values.Nombre;

import java.util.Objects;

public class Cuenta extends Entity<IdCuenta> {

    protected ClaveUsuario claveUsuario;
    protected Correo correo;
    protected Nombre nombre;

    public Cuenta(IdCuenta entityId, ClaveUsuario claveUsuario, Correo correo, Nombre nombre) {
        super(entityId);
        this.claveUsuario = claveUsuario;
        this.correo = correo;
        this.nombre = nombre;
    }

    public void cambiarClaveUsuario(ClaveUsuario claveUsuario){
        this.claveUsuario = Objects.requireNonNull(claveUsuario);
    }

    public void cambiarCorreoUsuario(Correo correo){
        this.correo = Objects.requireNonNull(correo);
    }

    public void cambiarNombreUsuario(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public ClaveUsuario claveUsuario(){
        return claveUsuario;
    }

    public Correo correo(){
        return correo;
    }

    public Nombre nombre(){
        return nombre;
    }
}
