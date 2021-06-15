package co.com.sofka.tienda.compra.commands;

import co.com.sofka.tienda.compra.values.Fecha;
import co.com.sofka.tienda.compra.values.IdCompra;
import co.com.sofka.tienda.compra.values.NumeroVideojuegos;
import co.com.sofka.tienda.compra.values.PrecioTotal;

public class AsociarFactura {
    private final IdCompra idCompra;
    private final PrecioTotal precioTotal;
    private final NumeroVideojuegos numeroVideojuegos;
    private final Fecha fecha;

    public AsociarFactura(IdCompra idCompra, PrecioTotal precioTotal, NumeroVideojuegos numeroVideojuegos, Fecha fecha) {
        this.idCompra = idCompra;
        this.precioTotal = precioTotal;
        this.numeroVideojuegos = numeroVideojuegos;
        this.fecha = fecha;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public PrecioTotal getPrecioTotal() {
        return precioTotal;
    }

    public NumeroVideojuegos getNumeroVideojuegos() {
        return numeroVideojuegos;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
