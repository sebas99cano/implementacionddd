package co.com.sofka.tienda.usuario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.usuario.values.IdUsuario;
import co.com.sofka.tienda.videojuego.Videojuego;

public class AgregarVideojuego implements Command {

    private final IdUsuario idUsuario;
    private final Videojuego videojuego;

    public AgregarVideojuego(IdUsuario idUsuario, Videojuego videojuego) {
        this.idUsuario = idUsuario;
        this.videojuego = videojuego;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public Videojuego getVideojuego() {
        return videojuego;
    }
}
