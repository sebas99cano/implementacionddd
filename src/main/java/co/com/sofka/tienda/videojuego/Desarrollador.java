package co.com.sofka.tienda.videojuego;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tienda.usuario.values.Nombre;
import co.com.sofka.tienda.videojuego.values.IdDesarrollador;

import java.util.Objects;

public class Desarrollador extends Entity<IdDesarrollador> {

    protected Nombre nombre;

    public Desarrollador(IdDesarrollador entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void cambiarNombreDesarrollador(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre nombre(){
        return nombre;
    }
}
