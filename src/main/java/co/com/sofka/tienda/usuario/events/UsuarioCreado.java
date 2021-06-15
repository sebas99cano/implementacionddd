package co.com.sofka.tienda.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.usuario.Cuenta;
import co.com.sofka.tienda.usuario.Tarjeta;
import co.com.sofka.tienda.videojuego.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class UsuarioCreado extends DomainEvent {

    private final Cuenta cuenta;
    private final List<Tarjeta> tarjetas;
    private final List<Videojuego> videojuegos;

    public UsuarioCreado(Cuenta cuenta) {
        super("tienda.usuario.usuariocreado");
        this.cuenta = cuenta;
        this.tarjetas = new ArrayList<>();
        this.videojuegos = new ArrayList<>();
    }

    public Cuenta getCuenta(){
        return this.cuenta;
    }

    public List<Tarjeta> getTarjetas(){
        return this.tarjetas;
    }

    public List<Videojuego> getVideojuegos(){
        return this.videojuegos;
    }
}
