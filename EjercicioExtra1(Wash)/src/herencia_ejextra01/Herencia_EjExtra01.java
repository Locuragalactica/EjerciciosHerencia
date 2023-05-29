/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejextra01;

import Entidad.Alquiler;

/**
 *
 * @author Estefania
 */
public class Herencia_EjExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alquiler alq1 = new Alquiler();
        alq1.alquilarBarco();
        
        Alquiler alq2 = new Alquiler();
        alq2.alquilarBarco();
    }
    
}
