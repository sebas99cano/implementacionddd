package co.com.sofka.tienda.videojuego;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tienda.videojuego.events.*;

public class VideojuegoChange extends EventChange {
    public VideojuegoChange(Videojuego videojuego) {

        apply((VideojuegoModificado event)->{
            videojuego.precio = event.getPrecio();
            videojuego.descripcion = event.getDescripcion();
            videojuego.precio = event.getPrecio();
        });

        apply((VideojuegoAdquirido event)->{
            videojuego.adquirido = event.getAdquirido();
        });

        apply((EditorModificado event)->{
            videojuego.editor = event.getEditor();
        });

        apply((DesarrolladorEditado event)->{
            videojuego.desarrollador = event.getDesarrollador();
        });

        apply((ValoresDeEstadisticaActualizados event)->{
            videojuego.estadisticas.actualizarValores(event.getNumeroVentas(),event.getDineroRecaudado());
        });

        apply((VideojuegoCreado event)->{
            videojuego.editor = event.getEditor();
            videojuego.desarrollador = event.getDesarrollador();
            videojuego.estadisticas = event.getEstadisticas();
            videojuego.precio = event.getPrecio();
            videojuego.descripcion = event.getDescripcion();
            videojuego.adquirido = event.getAdquirido();
        });

    }
}
