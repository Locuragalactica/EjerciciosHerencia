package entidades;

import java.time.LocalDate;

public class Velero extends Barco {

    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(int numMastiles, String matricula, int eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Numero Mastiles: " + numMastiles;
    }

    public void crearVelero(Velero v) {
        super.crearBarco(v);
        System.out.println("Ingrese la cantidad de mastiles");
        v.setNumMastiles(leer.nextInt());
        System.out.println("--------------Barco Ingresado--------------");
    }

}
