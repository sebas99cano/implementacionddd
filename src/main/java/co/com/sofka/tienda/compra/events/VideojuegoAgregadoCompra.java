package co.com.sofka.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.Videojuego;

public class VideojuegoAgregadoCompra extends DomainEvent {

    private final Videojuego videojuego;

    public VideojuegoAgregadoCompra(Videojuego videojuego) {
        super("tienda.compra.videojuegoagregadocompra");
        this.videojuego = videojuego;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}
