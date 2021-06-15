package co.com.sofka.tienda.videojuego.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.videojuego.values.Adquirido;
import co.com.sofka.tienda.videojuego.values.Descripcion;
import co.com.sofka.tienda.videojuego.values.IdVideojuego;
import co.com.sofka.tienda.videojuego.values.Precio;

public class ModificarVideojuego implements Command {
    private final IdVideojuego idVideojuego;
    private final Precio precio;
    private final Descripcion descripcion;
    private final Adquirido adquirido;

    public ModificarVideojuego(IdVideojuego idVideojuego, Precio precio, Descripcion descripcion, Adquirido adquirido) {
        this.idVideojuego = idVideojuego;
        this.precio = precio;
        this.descripcion = descripcion;
        this.adquirido = adquirido;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Adquirido getAdquirido() {
        return adquirido;
    }
}
