package entidades.ExtraHotelero;

public final class Residencia extends ExtraHotelero {

    private int cantHab;
    private boolean descGrem;
    private boolean campDeport;

    public Residencia() {
    }

    public Residencia(int cantHab, boolean descGrem, boolean campDeport) {
        this.cantHab = cantHab;
        this.descGrem = descGrem;
        this.campDeport = campDeport;
    }

    public Residencia(int cantHab, boolean descGrem, boolean campDeport, boolean privado, int cantM2) {
        super(privado, cantM2);
        this.cantHab = cantHab;
        this.descGrem = descGrem;
        this.campDeport = campDeport;
    }

    public Residencia(int cantHab, boolean descGrem, boolean campDeport, boolean privado, int cantM2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantM2, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descGrem = descGrem;
        this.campDeport = campDeport;
    }

    public boolean isDescGrem() {
        return descGrem;
    }


}
