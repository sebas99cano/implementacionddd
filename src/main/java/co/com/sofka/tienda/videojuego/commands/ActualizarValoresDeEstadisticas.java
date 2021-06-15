package co.com.sofka.tienda.videojuego.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.videojuego.values.DineroRecaudado;
import co.com.sofka.tienda.videojuego.values.IdVideojuego;
import co.com.sofka.tienda.videojuego.values.NumeroVentas;

public class ActualizarValoresDeEstadisticas implements Command {
    private final IdVideojuego idVideojuego;
    private final NumeroVentas numeroVentas;
    private final DineroRecaudado dineroRecaudado;

    public ActualizarValoresDeEstadisticas(IdVideojuego idVideojuego, NumeroVentas numeroVentas, DineroRecaudado dineroRecaudado) {
        this.idVideojuego = idVideojuego;
        this.numeroVentas = numeroVentas;
        this.dineroRecaudado = dineroRecaudado;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public NumeroVentas getNumeroVentas() {
        return numeroVentas;
    }

    public DineroRecaudado getDineroRecaudado() {
        return dineroRecaudado;
    }
}
