package co.com.sofka.tienda.videojuego.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.videojuego.Desarrollador;
import co.com.sofka.tienda.videojuego.values.IdVideojuego;

public class ModificarDesarrollador implements Command {
    private final IdVideojuego idVideojuego;
    private final Desarrollador desarrollador;

    public ModificarDesarrollador(IdVideojuego idVideojuego, Desarrollador desarrollador) {
        this.idVideojuego = idVideojuego;
        this.desarrollador = desarrollador;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }
}
