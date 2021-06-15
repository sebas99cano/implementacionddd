package co.com.sofka.tienda.compra;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tienda.compra.events.*;

public class CompraChange extends EventChange {
    public CompraChange(Compra compra) {

        apply((DescuentoAplicado event)->{
            compra.descuento.modificarFechaLimite(event.getFechaLimite());
            compra.descuento.modificarPorcentaje(event.getPorcentaje());
        });

        apply((FacturaAsociada event)->{
            compra.factura.modificarFecha(event.getFecha());
            compra.factura.modificarNumeroVideojuegos(event.getNumeroVideojuegos());
            compra.factura.modificarPrecioTotal(event.getPrecioTotal());
        });

        apply((FacturaModificada event)->{
            compra.factura = event.getFactura();
        });

        apply((DescuentoModificado event)->{
            compra.descuento = event.getDescuento();
        });

        apply((VideojuegoAgregadoCompra event)->{
            compra.videojuegos.add(event.getVideojuego());
        });

    }
}
