package co.com.sofka.tienda.usuario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.usuario.values.ClaveUsuario;
import co.com.sofka.tienda.usuario.values.Correo;

public class ValidarCuenta implements Command {

    private final Correo correo;
    private final ClaveUsuario claveUsuario;

    public ValidarCuenta(Correo correo, ClaveUsuario claveUsuario) {
        this.correo = correo;
        this.claveUsuario = claveUsuario;
    }

    public Correo getCorreo() {
        return correo;
    }

    public ClaveUsuario getClaveUsuario() {
        return claveUsuario;
    }
}
