package co.com.sofka.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.compra.Descuento;
import co.com.sofka.tienda.compra.Factura;
import co.com.sofka.tienda.compra.values.PrecioTotal;
import co.com.sofka.tienda.usuario.Usuario;
import co.com.sofka.tienda.videojuego.Videojuego;

import java.util.List;

public class CompraCreada extends DomainEvent {

    private final Usuario usuario;
    private final List<Videojuego> videojuegos;
    private final Factura factura;
    private final Descuento descuento;
    private final PrecioTotal precioTotal;

    public CompraCreada(Usuario usuario, List<Videojuego> videojuegos, Factura factura, Descuento descuento, PrecioTotal precioTotal) {
        super("tienda.compra.compracreada");
        this.usuario = usuario;
        this.videojuegos = videojuegos;
        this.factura = factura;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public Factura getFactura() {
        return factura;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public PrecioTotal getPrecioTotal() {
        return precioTotal;
    }
}
