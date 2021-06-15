package co.com.sofka.tienda.videojuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.values.DineroRecaudado;
import co.com.sofka.tienda.videojuego.values.NumeroVentas;

public class ValoresDeEstadisticaActualizados extends DomainEvent {

    private final NumeroVentas numeroVentas;
    private final DineroRecaudado dineroRecaudado;

    public ValoresDeEstadisticaActualizados(NumeroVentas numeroVentas, DineroRecaudado dineroRecaudado) {
        super("tienda.videojuego,valoresdeestadisticaactualizados");
        this.numeroVentas = numeroVentas;
        this.dineroRecaudado = dineroRecaudado;
    }

    public NumeroVentas getNumeroVentas() {
        return numeroVentas;
    }

    public DineroRecaudado getDineroRecaudado() {
        return dineroRecaudado;
    }
}
