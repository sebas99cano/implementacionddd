package co.com.sofka.tienda.usuario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tienda.usuario.values.IdTarjeta;
import co.com.sofka.tienda.usuario.values.InformacionTarjeta;

import java.util.Objects;


public class Tarjeta extends Entity<IdTarjeta> {

    protected InformacionTarjeta informacionTarjeta;

    public Tarjeta(IdTarjeta entityId, InformacionTarjeta informacionTarjeta) {
        super(entityId);
        this.informacionTarjeta = informacionTarjeta;
    }

    public void modificarInformacionTarjeta(InformacionTarjeta informacionTarjeta){
        this.informacionTarjeta = Objects.requireNonNull(informacionTarjeta);
    }

    public InformacionTarjeta informacionTarjeta(){
        return this.informacionTarjeta;
    }
}
