package co.com.sofka.tienda.compra.commands;

import co.com.sofka.tienda.compra.Descuento;
import co.com.sofka.tienda.compra.values.IdCompra;

public class ModificarDescuento {
    private final IdCompra idCompra;
    private final Descuento descuento;

    public ModificarDescuento(IdCompra idCompra, Descuento descuento) {
        this.idCompra = idCompra;
        this.descuento = descuento;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
