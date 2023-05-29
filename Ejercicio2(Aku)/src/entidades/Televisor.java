package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomesticos {
    private Double resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Double resolucion, boolean sintonizador, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        crearElectrodomestico();
        System.out.print("RESOLUCIÓN: ");
        this.resolucion= leer.nextDouble();
        System.out.print("SINTONIZADOR TDT (S/N): ");
        String rta = leer.next();
        if(rta.equalsIgnoreCase("S")){
            this.sintonizador=true;
        }else{
            setSintonizador(false);
        }
        
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if(getResolucion()>40){
            super.precio+=precio*0.3;
            //super.precio=precio*1.3;
        }
        if(sintonizador){
            super.precio+=500;
        }
    }
   
    
    @Override
    public void mostrar() {
        String rta;
        System.out.println("\nTELEVISOR: ");
        super.mostrar();
        if(isSintonizador()){
           rta = "SI" ;
        }else{
           rta = "NO";
        }
        System.out.println("RESOLUCIÓN: "+resolucion+ " pulgadas"
                       + "\nSINTONIZADOR TDT: "+rta);
    }
}
