package co.com.sofka.tienda.compra;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tienda.compra.values.Fecha;
import co.com.sofka.tienda.compra.values.IdDescuento;
import co.com.sofka.tienda.compra.values.Porcentaje;

public class Descuento extends Entity<IdDescuento> {

    protected Fecha fechaLimite;
    protected Porcentaje porcentaje;

    public Descuento(IdDescuento entityId, Fecha fechaLimite, Porcentaje porcentaje) {
        super(entityId);
        this.fechaLimite = fechaLimite;
        this.porcentaje = porcentaje;
    }

    public void modificarPorcentaje(Porcentaje porcentaje){
        this.porcentaje = porcentaje;
    }

    public void modificarFechaLimite(Fecha fechaLimite){
        this.fechaLimite = fechaLimite;
    }

    public Fecha fechaLimite() {
        return fechaLimite;
    }

    public Porcentaje porcentaje() {
        return porcentaje;
    }
}
