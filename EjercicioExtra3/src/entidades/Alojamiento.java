package entidades;

import java.util.Scanner;

public class Alojamiento {

    protected String nombre, direccion, localidad, gerente;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento: " + nombre;
    }

}
