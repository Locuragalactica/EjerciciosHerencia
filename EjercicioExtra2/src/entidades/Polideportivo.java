package entidades;

import java.util.Scanner;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private String tipoInstalacion;
    
    public Polideportivo() {
    }
    
    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }
    
    public Polideportivo(String nombre, String tipoInstalacion, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
    
    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    public Polideportivo crearPolideportivo() {
        Polideportivo p1 = new Polideportivo();
        System.out.println("Ingrese el ancho del edificio");
        p1.setAncho(leer.nextFloat());
        System.out.println("Ingrese el alto del edificio");
        p1.setAlto(leer.nextFloat());
        System.out.println("Ingrese el largo del edificio");
        p1.setAlto(leer.nextFloat());
        System.out.println("Ingrese el nombre del Polideportivo");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el tipo de Instalación: (Techado o Abierto)");
        p1.setTipoInstalacion(leer.next());
        
        return p1;
    }
    
    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }
    
    @Override
    public void calcularSuperficie() {
    }
    
    @Override
    public void calcularVolumen() {
    }
}
