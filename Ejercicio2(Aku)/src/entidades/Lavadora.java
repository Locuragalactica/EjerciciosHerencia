package entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodomesticos {
    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.print("CARGA: ");
        this.carga= leer.nextDouble();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if(carga>30){
            super.precio+=500;
        }
    }
    
    @Override
    public void mostrar() {
        System.out.println("\nLAVADORA: ");
        super.mostrar();
        System.out.println("CARGA: "+carga+ " kg");
    }

}
