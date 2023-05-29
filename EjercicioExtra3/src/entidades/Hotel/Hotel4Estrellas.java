package entidades.Hotel;

public class Hotel4Estrellas extends Hotel {

    protected char gimnasio;
    protected String nombreRest;
    protected int capacidadRest;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRest, int capacidadRest) {
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    public Hotel4Estrellas(char gimnasio, String nombreRest, int capacidadRest, int cantHab, int numCam, int cantPis, Double precio) {
        super(cantHab, numCam, cantPis, precio);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    public Hotel4Estrellas(char gimnasio, String nombreRest, int capacidadRest, int cantHab, int numCam, int cantPis, Double precio, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, numCam, cantPis, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    @Override
    public Double precioHab() {
        int valorRest;
        int valorGym;
        if (capacidadRest < 30) {
            valorRest = 10;
        } else if (capacidadRest > 30 && capacidadRest < 50) {
            valorRest = 30;
        } else {
            valorRest = 50;
        }

        if (gimnasio == 'A') {
            valorGym = 50;
        } else {
            valorGym = 30;
        }
        double preciohab = 50 + (1 * numCam) + valorRest + valorGym;

        precio = preciohab;

        return precio;
    }


}
