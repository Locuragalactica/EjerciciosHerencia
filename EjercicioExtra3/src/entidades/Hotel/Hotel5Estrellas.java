package entidades.Hotel;

public class Hotel5Estrellas extends Hotel4Estrellas {

    private int cantSalonConf, cantLimo, cantSuit;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantSalonConf, int cantLimo, int cantSuit) {
        this.cantSalonConf = cantSalonConf;
        this.cantLimo = cantLimo;
        this.cantSuit = cantSuit;
    }

    public Hotel5Estrellas(int cantSalonConf, int cantLimo, int cantSuit, char gimnasio, String nombreRest, int capacidadRest) {
        super(gimnasio, nombreRest, capacidadRest);
        this.cantSalonConf = cantSalonConf;
        this.cantLimo = cantLimo;
        this.cantSuit = cantSuit;
    }

    public Hotel5Estrellas(int cantSalonConf, int cantLimo, int cantSuit, char gimnasio, String nombreRest, int capacidadRest, int cantHab, int numCam, int cantPis, Double precio) {
        super(gimnasio, nombreRest, capacidadRest, cantHab, numCam, cantPis, precio);
        this.cantSalonConf = cantSalonConf;
        this.cantLimo = cantLimo;
        this.cantSuit = cantSuit;
    }

    public Hotel5Estrellas(int cantSalonConf, int cantLimo, int cantSuit, char gimnasio, String nombreRest, int capacidadRest, int cantHab, int numCam, int cantPis, Double precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRest, capacidadRest, cantHab, numCam, cantPis, precio, nombre, direccion, localidad, gerente);
        this.cantSalonConf = cantSalonConf;
        this.cantLimo = cantLimo;
        this.cantSuit = cantSuit;
    }

    @Override
    public Double precioHab() {
        precio = (double) super.precioHab() + (cantLimo * 15);
        return precio;
    }

}
