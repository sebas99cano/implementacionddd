package co.com.sofka.tienda.videojuego.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tienda.videojuego.Editor;
import co.com.sofka.tienda.videojuego.values.IdVideojuego;

public class ModificarEditor implements Command {
    private final IdVideojuego idVideojuego;
    private final Editor editor;

    public ModificarEditor(IdVideojuego idVideojuego, Editor editor) {
        this.idVideojuego = idVideojuego;
        this.editor = editor;
    }

    public IdVideojuego getIdVideojuego() {
        return idVideojuego;
    }

    public Editor getEditor() {
        return editor;
    }
}
