package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Barco {

    protected String matricula;
    protected int eslora;
    protected LocalDate anioFabricacion;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

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

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\n"
                +"Eslora: " + eslora;
    }

    public void crearBarco(Barco b1) {
        System.out.println("Ingrese la matricula de su barco");
        b1.setMatricula(leer.next());
        System.out.println("Ingrese la eslora del barco en metros");
        b1.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de fabricación de la embarcación (aaaa-mm-dd)");
        b1.setAnioFabricacion(LocalDate.parse(leer.next()));

    }

}
