package entidades;

import java.time.LocalDate;

public class Alquiler {

    private String nombre;
    private String DNI;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler: \n"
                + "Nombre: " + nombre + "\n"
                + "DNI: " + DNI + "\n"
                + "Fecha Alquiler: " + fechaAlquiler + "\n"
                + "Fecha Devolucion: " + fechaDevolucion + "\n"
                + "Posicion Amarre: " + posicionAmarre + "\n"
                + "Barco: " + barco + "\n"
                + "--------------------------------------------";

    }

}
