package co.com.sofka.tienda.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.usuario.Cuenta;

public class CuentaModificada extends DomainEvent {
    private final Cuenta cuenta;
    public CuentaModificada(Cuenta cuenta) {
        super("tienda.usuario.cuentamodificada");
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta(){
        return this.cuenta;
    }
}
