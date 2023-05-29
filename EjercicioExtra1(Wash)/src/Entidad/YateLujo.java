/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Estefania
 */
public class YateLujo extends Barco{
    private double potenciaCV;
    private int numCamarote;

    public YateLujo() {
    }

    public YateLujo(double potenciaCV, int numCamarote, String matricula, int eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarote = numCamarote;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarote() {
        return numCamarote;
    }

    public void setNumCamarote(int numCamarote) {
        this.numCamarote = numCamarote;
    }

    @Override
    public String toString() {
        return "YateLujo{" + "potenciaCV=" + potenciaCV + ", numCamarote=" + numCamarote + '}';
    }

    void crearYateLujo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearBarco();
        System.out.print("Ingrese potencia en CV: ");
        this.potenciaCV = leer.nextDouble();
        System.out.print("Ingrese número de camarotes: ");
        this.numCamarote = leer.nextInt();
        
    }
    
}
