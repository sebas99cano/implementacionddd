package co.com.sofka.tienda.usuario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.usuario.Cuenta;
import co.com.sofka.tienda.usuario.values.IdUsuario;

public class CrearUsuario implements Command {
    private final IdUsuario entityId;
    private final Cuenta cuenta;

    public CrearUsuario(IdUsuario entityId, Cuenta cuenta) {
        this.entityId = entityId;
        this.cuenta = cuenta;
    }

    public IdUsuario getEntityId() {
        return entityId;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
