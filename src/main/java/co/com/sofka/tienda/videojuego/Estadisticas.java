package co.com.sofka.tienda.videojuego;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tienda.videojuego.values.DineroRecaudado;
import co.com.sofka.tienda.videojuego.values.IdEstadisticas;
import co.com.sofka.tienda.videojuego.values.NumeroVentas;

import java.util.Objects;

public class Estadisticas extends Entity<IdEstadisticas> {

    protected NumeroVentas numeroVentas;
    protected DineroRecaudado dineroRecaudado;

    public Estadisticas(IdEstadisticas entityId, NumeroVentas numeroVentas, DineroRecaudado dineroRecaudado) {
        super(entityId);
        this.numeroVentas = numeroVentas;
        this.dineroRecaudado = dineroRecaudado;
    }

    public void actualizarValores(NumeroVentas numeroVentas, DineroRecaudado dineroRecaudado){
        this.numeroVentas = Objects.requireNonNull(numeroVentas);
        this.dineroRecaudado = Objects.requireNonNull(dineroRecaudado);
    }

    public NumeroVentas numeroVentas(){
        return this.numeroVentas;
    }

    public DineroRecaudado dineroRecaudado(){
        return this.dineroRecaudado;
    }
}
