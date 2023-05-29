package entidades;

import java.time.LocalDate;

public class Empleado extends Persona {

    protected String anioIng, numDespacho;

    public Empleado() {
    }

    public Empleado(String anioIng, String numDespacho, String nombre, String apellido, String ID, String estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.anioIng = anioIng;
        this.numDespacho = numDespacho;
    }

    public String getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {

        return super.toString() + "\n"
                + "Año Ingreso: " + anioIng + "\n"
                + "Num Despacho: " + numDespacho;
    }

}
