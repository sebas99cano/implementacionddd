package co.com.sofka.tienda.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.usuario.values.IdTarjeta;
import co.com.sofka.tienda.usuario.values.InformacionTarjeta;

public class TarjetaAgregada extends DomainEvent {

    private final IdTarjeta idTarjeta;
    private final InformacionTarjeta informacionTarjeta;

    public TarjetaAgregada(IdTarjeta entityId, InformacionTarjeta informacionTarjeta) {
        super("tienda.usuario.tarjetaagregada");
        this.idTarjeta = entityId;
        this.informacionTarjeta = informacionTarjeta;
    }

    public IdTarjeta getIdTarjeta() {
        return idTarjeta;
    }

    public InformacionTarjeta getInformacionTarjeta() {
        return informacionTarjeta;
    }
}
