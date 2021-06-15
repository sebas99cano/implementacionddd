package co.com.sofka.tienda.videojuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.Desarrollador;
import co.com.sofka.tienda.videojuego.Editor;
import co.com.sofka.tienda.videojuego.Estadisticas;
import co.com.sofka.tienda.videojuego.values.Adquirido;
import co.com.sofka.tienda.videojuego.values.Descripcion;
import co.com.sofka.tienda.videojuego.values.Precio;

public class VideojuegoCreado extends DomainEvent {

    private final Editor editor;
    private final Desarrollador desarrollador;
    private final Estadisticas estadisticas;
    private final Precio precio;
    private final Descripcion descripcion;
    private final Adquirido adquirido;

    public VideojuegoCreado(Editor editor, Desarrollador desarrollador, Estadisticas estadisticas, Precio precio, Descripcion descripcion, Adquirido adquirido) {
        super("tienda.videojuego.videojuegocreado");
        this.editor = editor;
        this.desarrollador = desarrollador;
        this.estadisticas = estadisticas;
        this.precio = precio;
        this.descripcion = descripcion;
        this.adquirido = adquirido;
    }

    public Editor getEditor() {
        return editor;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
