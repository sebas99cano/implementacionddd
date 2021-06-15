package co.com.sofka.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.compra.values.Fecha;
import co.com.sofka.tienda.compra.values.NumeroVideojuegos;
import co.com.sofka.tienda.compra.values.PrecioTotal;

public class FacturaAsociada extends DomainEvent {

    private final PrecioTotal precioTotal;
    private final NumeroVideojuegos numeroVideojuegos;
    private final Fecha fecha;

    public FacturaAsociada(PrecioTotal precioTotal, NumeroVideojuegos numeroVideojuegos, Fecha fecha) {
        super("tienda.compra.facturaasociada");
        this.precioTotal = precioTotal;
        this.numeroVideojuegos = numeroVideojuegos;
        this.fecha = fecha;
    }

    public PrecioTotal getPrecioTotal() {
        return precioTotal;
    }

    public NumeroVideojuegos getNumeroVideojuegos() {
        return numeroVideojuegos;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
