package entidades;

import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    private int nOfi, cantPer, numPis;
    //Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nOfi, int cantPer, int numPis) {
        this.nOfi = nOfi;
        this.cantPer = cantPer;
        this.numPis = numPis;
    }

    public EdificioDeOficinas(int nOfi, int cantPer, int numPis, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nOfi = nOfi;
        this.cantPer = cantPer;
        this.numPis = numPis;
    }

    public int getnOfi() {
        return nOfi;
    }

    public void setnOfi(int nOfi) {
        this.nOfi = nOfi;
    }

    public int getCantPer() {
        return cantPer;
    }

    public void setCantPer(int cantPer) {
        this.cantPer = cantPer;
    }

    public int getNumPis() {
        return numPis;
    }

    public void setNumPis(int numPis) {
        this.numPis = numPis;
    }

    public EdificioDeOficinas crearEdificioDeOficina() {
        EdificioDeOficinas e1 = new EdificioDeOficinas();
        System.out.println("Ingrese el ancho del edificio");
        e1.setAncho(leer.nextFloat());
        System.out.println("Ingrese el alto del edificio");
        e1.setAlto(leer.nextFloat());
        System.out.println("Ingrese el largo del edificio");
        e1.setAlto(leer.nextFloat());
        System.out.println("Ingrese la cantidad de oficinas por piso");
        e1.setnOfi(leer.nextInt());
        System.out.println("Ingrese la cantidad de pisos");
        e1.setNumPis(leer.nextInt());
        System.out.println("Ingrese la cantidad personass");
        e1.setCantPer(leer.nextInt());
        return e1;

    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "nOfi=" + nOfi + ", cantPer=" + cantPer + ", numPis=" + numPis;
    }

    @Override
    public void calcularSuperficie() {
    }

    @Override
    public void calcularVolumen() {
    }

}
