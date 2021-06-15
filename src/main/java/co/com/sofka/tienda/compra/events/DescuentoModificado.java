package co.com.sofka.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.compra.Descuento;

public class DescuentoModificado extends DomainEvent {

    private final Descuento descuento;

    public DescuentoModificado(Descuento descuento) {
        super("tienda.compra.descuentomodificado");
        this.descuento = descuento;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
