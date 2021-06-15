package co.com.sofka.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.compra.Factura;

public class FacturaModificada extends DomainEvent {

    private final Factura factura;

    public FacturaModificada(Factura factura) {
        super("tienda.compra.facturamodificada");
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }
}
