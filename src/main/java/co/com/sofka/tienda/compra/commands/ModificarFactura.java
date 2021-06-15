package co.com.sofka.tienda.compra.commands;

import co.com.sofka.tienda.compra.Factura;
import co.com.sofka.tienda.compra.values.IdCompra;

public class ModificarFactura {

    private final IdCompra idCompra;
    private final Factura factura;

    public ModificarFactura(IdCompra idCompra, Factura factura) {
        this.idCompra = idCompra;
        this.factura = factura;
    }

    public IdCompra getIdCompra() {
        return idCompra;
    }

    public Factura getFactura() {
        return factura;
    }
}
