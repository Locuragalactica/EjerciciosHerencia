package Ejercicio2;

import entidades.Electrodomesticos;
import entidades.Lavadora;
import entidades.Televisor;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        /*
        
        
        */
        Lavadora e1 = new Lavadora();
        System.out.println("AGREGAR LAVADORA");
        e1.crearLavadora();
        e1.precioFinal();
        e1.mostrar();
        System.out.println("--------------------------------------");
        System.out.println("AGREGAR TELEVISOR");
        Televisor e2 = new Televisor();
        e2.crearTelevisor();
        e2.precioFinal();
        e2.mostrar();
        
    }
    
}
