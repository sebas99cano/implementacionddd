package co.com.sofka.tienda.videojuego;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tienda.usuario.values.Nombre;
import co.com.sofka.tienda.videojuego.values.IdEditor;

import java.util.Objects;

public class Editor extends Entity<IdEditor> {
    protected Nombre nombre;

    public Editor(IdEditor entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void cambiarNombreEditor(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre nombre(){return this.nombre;}
}
