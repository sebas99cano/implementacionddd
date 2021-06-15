package co.com.sofka.tienda.videojuego;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.events.*;
import co.com.sofka.tienda.videojuego.values.*;

import java.util.List;
import java.util.Objects;

public class Videojuego extends AggregateEvent<IdVideojuego> {

    protected Editor editor;
    protected Desarrollador desarrollador;
    protected Estadisticas estadisticas;
    protected Precio precio;
    protected Descripcion descripcion;
    protected Adquirido adquirido;

    public Videojuego(IdVideojuego entityId, Editor editor, Desarrollador desarrollador, Estadisticas estadisticas, Precio precio, Descripcion descripcion, Adquirido adquirido) {
        super(entityId);
        appendChange(new VideojuegoCreado(editor,desarrollador,estadisticas,precio,descripcion,adquirido)).apply();
    }

    public Videojuego(IdVideojuego entityId) {
        super(entityId);
        subscribe(new VideojuegoChange(this));
    }

    public static Videojuego from(IdVideojuego idVideojuego, List<DomainEvent> events){
        var videojuego = new Videojuego(idVideojuego);
        events.forEach(videojuego::applyEvent);
        return videojuego;
    }

    public void modificarVideojuego(Precio precio, Descripcion descripcion, Adquirido adquirido){
        Objects.requireNonNull(precio);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(adquirido);
        appendChange(new VideojuegoModificado(precio,descripcion,adquirido)).apply();
    }

    public void adquirirVideojuego(Adquirido adquirido){
        Objects.requireNonNull(adquirido);
        appendChange(new VideojuegoAdquirido(adquirido)).apply();
    }

    public void modificarEditor(Editor editor){
        Objects.requireNonNull(editor);
        appendChange(new EditorModificado(editor)).apply();
    }

    public void modificarDesarrollador(Desarrollador desarrollador){
        Objects.requireNonNull(desarrollador);
        appendChange(new DesarrolladorEditado(desarrollador)).apply();
    }

    public void actualizarValoresDeEstadisticas(NumeroVentas numeroVentas, DineroRecaudado dineroRecaudado){
        appendChange(new ValoresDeEstadisticaActualizados(numeroVentas,dineroRecaudado)).apply();
    }

    public Editor editor() {
        return editor;
    }

    public Desarrollador desarrollador() {
        return desarrollador;
    }

    public Estadisticas rstadisticas() {
        return estadisticas;
    }

    public Precio precio() {
        return precio;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Adquirido adquirido() {
        return adquirido;
    }
}
