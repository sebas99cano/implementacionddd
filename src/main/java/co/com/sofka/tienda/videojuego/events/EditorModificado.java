package co.com.sofka.tienda.videojuego.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tienda.videojuego.Editor;

public class EditorModificado extends DomainEvent {

    public final Editor editor;

    public EditorModificado(Editor editor) {
        super("tienda.videojuego.editormodificado");
        this.editor = editor;
    }

    public Editor getEditor() {
        return editor;
    }
}
