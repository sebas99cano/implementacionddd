package co.com.sofka.tienda.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.usuario.Cuenta;

public class CuentaValidada extends DomainEvent {
    private final Cuenta cuenta;

    public CuentaValidada(Cuenta cuenta) {
        super("tienda.usuario.cuentavalidada");
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta(){
        return this.cuenta;
    }
}
