package co.com.sofka.tienda.compra.commands;

import co.com.sofka.tienda.compra.values.IdCompra;
import co.com.sofka.tienda.videojuego.Videojuego;

public class AgregarVideojuegoCompra {

    private final IdCompra idCompra;
    private final Videojuego videojuego;

    public AgregarVideojuegoCompra(IdCompra idCompra, Videojuego videojuego) {
        this.idCompra = idCompra;
        this.videojuego = videojuego;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}
