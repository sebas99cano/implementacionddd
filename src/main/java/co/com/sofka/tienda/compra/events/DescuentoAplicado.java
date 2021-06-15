package co.com.sofka.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.compra.values.Fecha;
import co.com.sofka.tienda.compra.values.Porcentaje;

public class DescuentoAplicado extends DomainEvent {

    private final Fecha fechaLimite;
    private final Porcentaje porcentaje;

    public DescuentoAplicado(Fecha fechaLimite, Porcentaje porcentaje) {
        super("tienda.compra.descuentoaplicado");
        this.fechaLimite = fechaLimite;
        this.porcentaje = porcentaje;
    }

    public Fecha getFechaLimite() {
        return fechaLimite;
    }

    public Porcentaje getPorcentaje() {
        return porcentaje;
    }
}
