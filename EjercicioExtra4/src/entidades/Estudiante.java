package entidades;

import java.util.ArrayList;

public final class Estudiante extends Persona {

    private String curso;

    public Estudiante(String curso, String nombre, String apellido, String ID, String estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Estudiante " + "\n"
                + "Curso: " + curso + "\n"
                + "-----------------------------------";
    }

}
