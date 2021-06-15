package co.com.sofka.tienda.videojuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.Desarrollador;

public class DesarrolladorEditado extends DomainEvent {

    private final Desarrollador desarrollador;

    public DesarrolladorEditado(Desarrollador desarrollador) {
        super("tienda.videojuego.desarrolladoreditado");
        this.desarrollador = desarrollador;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }
}
