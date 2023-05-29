/*
 2. Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:

 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author PAVILION
 */
public abstract class Edificio {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double ancho, alto, largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();
    public void llenarDatos(){
        System.out.println("¿Cual es el alto de su edificio?");
        alto = leer.nextDouble();
        System.out.println("¿Cual es el ancho de su edificio?");
        ancho = leer.nextDouble();
        System.out.println("¿Cual es el largo de su edificio?");
        largo  = leer.nextDouble();
    }
}
