package co.com.sofka.tienda.videojuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.values.Adquirido;
import co.com.sofka.tienda.videojuego.values.Descripcion;
import co.com.sofka.tienda.videojuego.values.Precio;

public class VideojuegoModificado extends DomainEvent {

    private final Precio precio;
    private final Descripcion descripcion;
    private final Adquirido adquirido;

    public VideojuegoModificado(Precio precio, Descripcion descripcion, Adquirido adquirido) {
        super("tienda.videojuego.videojuegomodificado");
        this.precio = precio;
        this.descripcion = descripcion;
        this.adquirido = adquirido;
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
