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
public class Barco {
    protected String matricula;
    protected int eslora;
    protected LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    

    
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Matrícula: ");
        this.matricula = leer.next();
        System.out.print("Eslora: ");
        this.eslora = leer.nextInt();
        System.out.print("Año de fabricación (aaaa-mm-dd): ");
        this.anioFabricacion = LocalDate.parse(leer.next());
    }
}
