package co.com.sofka.tienda.compra;


import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tienda.compra.values.Fecha;
import co.com.sofka.tienda.compra.values.IdFactura;
import co.com.sofka.tienda.compra.values.NumeroVideojuegos;
import co.com.sofka.tienda.compra.values.PrecioTotal;

public class Factura extends Entity<IdFactura> {

    protected PrecioTotal precioTotal;
    protected NumeroVideojuegos numeroVideojuegos;
    protected Fecha fecha;

    public Factura(IdFactura entityId, PrecioTotal precioTotal, NumeroVideojuegos numeroVideojuegos, Fecha fecha) {
        super(entityId);
        this.precioTotal = precioTotal;
        this.numeroVideojuegos = numeroVideojuegos;
        this.fecha = fecha;
    }

    public void modificarPrecioTotal(PrecioTotal precioTotal){
        this.precioTotal = precioTotal;
    }

    public void modificarNumeroVideojuegos(NumeroVideojuegos numeroVideojuegos){
        this.numeroVideojuegos = numeroVideojuegos;
    }

    public void modificarFecha(Fecha fecha){
        this.fecha = fecha;
    }

    public PrecioTotal precioTotal() {
        return precioTotal;
    }

    public NumeroVideojuegos numeroVideojuegos() {
        return numeroVideojuegos;
    }

    public Fecha fecha() {
        return fecha;
    }
}
