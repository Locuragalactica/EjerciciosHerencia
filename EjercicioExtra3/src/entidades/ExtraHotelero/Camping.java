package entidades.ExtraHotelero;

public final class Camping extends ExtraHotelero {

    private int capMaxCarp, cantBan;
    private boolean restarante;

    public Camping() {
    }

    public Camping(int capMaxCarp, int cantBan, boolean restarante) {
        this.capMaxCarp = capMaxCarp;
        this.cantBan = cantBan;
        this.restarante = restarante;
    }

    public Camping(int capMaxCarp, int cantBan, boolean restarante, boolean privado, int cantM2) {
        super(privado, cantM2);
        this.capMaxCarp = capMaxCarp;
        this.cantBan = cantBan;
        this.restarante = restarante;
    }

    public Camping(int capMaxCarp, int cantBan, boolean restarante, boolean privado, int cantM2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantM2, nombre, direccion, localidad, gerente);
        this.capMaxCarp = capMaxCarp;
        this.cantBan = cantBan;
        this.restarante = restarante;
    }

    public boolean isRestarante() {
        return restarante;
    }


}
