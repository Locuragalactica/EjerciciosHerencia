package entidades.ExtraHotelero;

import entidades.Alojamiento;

public class ExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected int cantM2;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, int cantM2) {
        this.privado = privado;
        this.cantM2 = cantM2;
    }

    public ExtraHotelero(boolean privado, int cantM2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantM2 = cantM2;
    }

}
