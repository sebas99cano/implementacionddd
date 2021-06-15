package co.com.sofka.tienda.videojuego.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.videojuego.values.Adquirido;
import co.com.sofka.tienda.videojuego.values.IdVideojuego;

public class AdquirirVideojuego implements Command {

    private final IdVideojuego idVideojuego;
    private final Adquirido adquirido;

    public AdquirirVideojuego(IdVideojuego idVideojuego, Adquirido adquirido) {
        this.idVideojuego = idVideojuego;
        this.adquirido = adquirido;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
