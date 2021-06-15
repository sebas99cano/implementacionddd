package co.com.sofka.tienda.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.usuario.events.*;
import co.com.sofka.tienda.usuario.values.IdTarjeta;
import co.com.sofka.tienda.usuario.values.IdUsuario;
import co.com.sofka.tienda.usuario.values.InformacionTarjeta;
import co.com.sofka.tienda.videojuego.Videojuego;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Usuario extends AggregateEvent<IdUsuario> {

    protected List<Tarjeta> tarjetas;
    protected Cuenta cuenta;
    protected List<Videojuego> videojuegos;

    public Usuario(IdUsuario entityId, Cuenta cuenta) {
        super(entityId);
        appendChange(new UsuarioCreado(cuenta)).apply();
    }

    private Usuario(IdUsuario entityId){
        super(entityId);
        subscribe(new UsuarioChange(this));
    }

    public static Usuario from(IdUsuario idUsuario, List<DomainEvent> events){
        var usuario = new Usuario(idUsuario);
        events.forEach(usuario::applyEvent);
        return usuario;
    }

    public void agregarTarjeta(IdTarjeta entityId, InformacionTarjeta informacionTarjeta){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacionTarjeta);
        appendChange(new TarjetaAgregada(entityId,informacionTarjeta)).apply();
    }

    public void agregarVideojuego(Videojuego videojuego){
        Objects.requireNonNull(videojuego);
        appendChange(new VideojuegoAgregado(videojuego)).apply();
    }

    public void validarCuenta(Cuenta cuenta){
        Objects.requireNonNull(cuenta);
        appendChange(new CuentaValidada(cuenta)).apply();
    }

    public void modificarTarjeta(InformacionTarjeta informacionTarjeta, IdTarjeta idTarjeta){
        Objects.requireNonNull(informacionTarjeta);
        Objects.requireNonNull(idTarjeta);
        appendChange(new TarjetaModificada(informacionTarjeta, idTarjeta)).apply();
    }

    public void modificarCuenta(Cuenta cuenta){
        Objects.requireNonNull(cuenta);
        appendChange(new CuentaModificada(cuenta)).apply();
    }

    protected Optional<Tarjeta> getTarjetaById(IdTarjeta idTarjeta){
        return tarjetas().stream().filter(tarjeta -> tarjeta.identity().equals(idTarjeta)).findFirst();
    }

    public List<Tarjeta> tarjetas(){
        return this.tarjetas;
    }

    public List<Videojuego> videojuegos(){
        return this.videojuegos;
    }

    public Cuenta cuenta(){
        return this.cuenta;
    }
}
