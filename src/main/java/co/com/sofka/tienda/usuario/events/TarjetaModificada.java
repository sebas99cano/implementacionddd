package co.com.sofka.tienda.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.usuario.Tarjeta;
import co.com.sofka.tienda.usuario.values.IdTarjeta;
import co.com.sofka.tienda.usuario.values.InformacionTarjeta;

public class TarjetaModificada extends DomainEvent {

    private final InformacionTarjeta informacionTarjeta;
    private final IdTarjeta idTarjeta;

    public TarjetaModificada(InformacionTarjeta informacionTarjeta, IdTarjeta idTarjeta) {
        super("tienda.usuario.tarjetamodificada");
        this.informacionTarjeta = informacionTarjeta;
        this.idTarjeta = idTarjeta;
    }

    public InformacionTarjeta getInformacionTarjeta(){
        return this.informacionTarjeta;
    }

    public IdTarjeta getIdTarjeta(){
        return this.idTarjeta;
    }
}
