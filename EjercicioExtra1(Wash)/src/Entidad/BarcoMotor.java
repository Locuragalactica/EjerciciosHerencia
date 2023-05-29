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
public class BarcoMotor extends Barco{
    private double potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(double potenciaCV, String matricula, int eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }
    

    public void crearBarcoMotor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearBarco();
        System.out.print("Ingrese potencia en CV: ");
        this.potenciaCV = leer.nextDouble();
    }
    
}
