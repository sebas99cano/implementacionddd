package co.com.sofka.tienda.videojuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.values.Adquirido;

public class VideojuegoAdquirido extends DomainEvent {

    private final Adquirido adquirido;

    public VideojuegoAdquirido(Adquirido adquirido) {
        super("tienda.videojuegos.videojuegoadquirido");
        this.adquirido = adquirido;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
