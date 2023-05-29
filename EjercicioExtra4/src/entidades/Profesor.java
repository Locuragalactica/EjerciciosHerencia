package entidades;

import java.util.ArrayList;

public final class Profesor extends Empleado {

    private String departamento;

    public Profesor(String departamento, String anioIng, String numDespacho, String nombre, String apellido, String ID, String estadoCivil) {
        super(anioIng, numDespacho, nombre, apellido, ID, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Profesor " + "\n"
                + "Departamento: " + departamento + "\n"
                + "-----------------------------------";
    }

}
