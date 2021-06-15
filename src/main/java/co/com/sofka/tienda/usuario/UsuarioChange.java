package co.com.sofka.tienda.usuario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tienda.usuario.events.*;


public class UsuarioChange extends EventChange {
    public UsuarioChange(Usuario usuario) {

        apply((UsuarioCreado event) ->{
            usuario.cuenta = event.getCuenta();
            usuario.tarjetas = event.getTarjetas();
            usuario.videojuegos = event.getVideojuegos();
        });

        apply((CuentaModificada event)->{
            usuario.cuenta = event.getCuenta();
        });

        apply((TarjetaModificada event)->{
            var tarjeta = usuario.getTarjetaById(event.getIdTarjeta()).orElseThrow(()->(new IllegalArgumentException("No se encontro la tarjeta")));
            tarjeta.modificarInformacionTarjeta(event.getInformacionTarjeta());
        });

        apply((CuentaValidada event)->{
            //hay que aplicar validaciones al objeto cuenta que llega en el evento
            usuario.cuenta = event.getCuenta();
        });

        apply((VideojuegoAgregado event)->{
            usuario.videojuegos.add(event.getVideojuego());
        });

        apply((TarjetaAgregada event)->{
            usuario.tarjetas.add(new Tarjeta(event.getIdTarjeta(),event.getInformacionTarjeta()));
        });

    }
}
