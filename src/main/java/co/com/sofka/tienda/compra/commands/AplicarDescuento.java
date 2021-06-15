package co.com.sofka.tienda.compra.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.compra.values.Fecha;
import co.com.sofka.tienda.compra.values.IdCompra;
import co.com.sofka.tienda.compra.values.Porcentaje;

public class AplicarDescuento implements Command {
    private final IdCompra idCompra;
    private final Fecha fechaLimite;
    private final Porcentaje porcentaje;

    public AplicarDescuento(IdCompra idCompra, Fecha fechaLimite, Porcentaje porcentaje) {
        this.idCompra = idCompra;
        this.fechaLimite = fechaLimite;
        this.porcentaje = porcentaje;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public Fecha getFechaLimite() {
        return fechaLimite;
    }

    public Porcentaje getPorcentaje() {
        return porcentaje;
    }
}
