package co.com.sofka.tienda.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.Videojuego;

public class VideojuegoAgregado extends DomainEvent {

    private final Videojuego videojuego;

    public VideojuegoAgregado(Videojuego videojuego) {
        super("tienda.usuario.videojuegoagregado");
        this.videojuego = videojuego;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}
