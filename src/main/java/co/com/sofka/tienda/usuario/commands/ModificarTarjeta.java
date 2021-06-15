package co.com.sofka.tienda.usuario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.usuario.values.IdTarjeta;
import co.com.sofka.tienda.usuario.values.IdUsuario;
import co.com.sofka.tienda.usuario.values.InformacionTarjeta;

public class ModificarTarjeta implements Command {
    private final IdUsuario idUsuario;
    private final InformacionTarjeta informacionTarjeta;
    private final IdTarjeta idTarjeta;

    public ModificarTarjeta(IdUsuario idUsuario, InformacionTarjeta informacionTarjeta, IdTarjeta idTarjeta) {
        this.idUsuario = idUsuario;
        this.informacionTarjeta = informacionTarjeta;
        this.idTarjeta = idTarjeta;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public InformacionTarjeta getInformacionTarjeta() {
        return informacionTarjeta;
    }

    public IdTarjeta getIdTarjeta() {
        return idTarjeta;
    }
}

