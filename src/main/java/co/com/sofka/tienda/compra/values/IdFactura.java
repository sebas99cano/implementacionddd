package co.com.sofka.tienda.compra.values;

import co.com.sofka.domain.generic.Identity;

public class IdFactura extends Identity {

    public IdFactura(String uuid) {
        super(uuid);
    }

    public IdFactura() {
    }

    public static IdFactura of(String id){
        return new IdFactura(id);
    }
}
