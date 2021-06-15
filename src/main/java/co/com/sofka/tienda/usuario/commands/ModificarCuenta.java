package co.com.sofka.tienda.usuario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.usuario.Cuenta;
import co.com.sofka.tienda.usuario.values.IdUsuario;

public class ModificarCuenta implements Command {
    private final IdUsuario idUsuario;
    private final Cuenta cuenta;


    public ModificarCuenta(IdUsuario idUsuario, Cuenta cuenta) {
        this.idUsuario = idUsuario;
        this.cuenta = cuenta;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
