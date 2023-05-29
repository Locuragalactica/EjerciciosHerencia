package entidades.Hotel;

import entidades.Alojamiento;

public abstract class Hotel extends Alojamiento {

    protected int cantHab, numCam, cantPis;
    protected Double precio;

    public Hotel() {
    }

    public Hotel(int cantHab, int numCam, int cantPis, Double precio) {
        this.cantHab = cantHab;
        this.numCam = numCam;
        this.cantPis = cantPis;
        this.precio = precio;
    }

    public Hotel(int cantHab, int numCam, int cantPis, Double precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.numCam = numCam;
        this.cantPis = cantPis;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public abstract Double precioHab();

}
