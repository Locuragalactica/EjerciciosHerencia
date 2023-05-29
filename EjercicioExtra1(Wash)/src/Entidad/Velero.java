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
public class Velero extends Barco{
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, int eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + '}';
    }

    void crearVelero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearBarco();
        System.out.print("Ingrese número de mastiles: ");
        this.numMastiles = leer.nextInt();
    }
    
    
}
