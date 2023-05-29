/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Estefania
 */
public class Alquiler {
    private String nombre;
    private String documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void alquilarBarco(){
        long subtotal;
        int moduloBarco;
        System.out.print("Nombre: ");
        this.nombre = leer.next();
        System.out.print("Documento del cliente: ");
        this.documento = leer.next();
        System.out.print("Fecha de alquiler (aaaa-mm-dd): ");
        this.fechaAlquiler = LocalDate.parse(leer.next());
        System.out.print("Fecha de devolución (aaaa-mm-dd): ");
        this.fechaDevolucion = LocalDate.parse(leer.next());
        System.out.print("Posición del amarre: ");
        this.posicionAmarre = leer.nextInt(); 
        double valorAnadido=0;
        System.out.print("\nTipo de Barco: "
                + "\n1. Barco a Motor."
                + "\n2. Velero."
                + "\n3. Yates de Lujos."
                + "\n4. Ninguno.");
        System.out.println("Ingrese una opción (1-4): ");
        int opc = leer.nextInt();
        long diasAlquiler = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        switch(opc){
            case 1:
                BarcoMotor bm = new BarcoMotor();
                bm.crearBarcoMotor();
                valorAnadido = bm.getPotenciaCV();
                moduloBarco = 10 * bm.getEslora();
                break;
            case 2:
                Velero vl = new Velero();
                vl.crearVelero();
                valorAnadido = vl.getNumMastiles();
                moduloBarco = 10 * vl.getEslora();
                break;
            case 3:
                YateLujo yt = new YateLujo();
                yt.crearYateLujo();
                valorAnadido = yt.getPotenciaCV()+yt.getNumCamarote();
                moduloBarco = 10 * yt.getEslora();
                break;
            default:
                Barco barc = new Barco();
                barc.crearBarco();
                moduloBarco = 10 * barc.getEslora();
                break;
        } 
        subtotal = diasAlquiler*moduloBarco;
        System.out.println("Alquiler: $ "+(subtotal+valorAnadido));
    }
    
    
}
