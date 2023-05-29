package entidades;

import java.util.ArrayList;

public final class PdServicio extends Empleado {

    private String seccion;

    public PdServicio(String seccion, String anioIng, String numDespacho, String nombre, String apellido, String ID, String estadoCivil) {
        super(anioIng, numDespacho, nombre, apellido, ID, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Personal de Servicio " + "\n"
                + "Seccion: " + seccion + "\n"
                + "-----------------------------------";
    }

}
