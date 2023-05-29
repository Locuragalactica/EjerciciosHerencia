package entidades;

import java.util.Scanner;

public abstract class Edificio {

    protected float ancho, alto, largo;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Edificio() {
    }

    public Edificio(float ancho, float alto, float largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

}
