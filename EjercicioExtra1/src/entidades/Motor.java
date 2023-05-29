package entidades;

import java.time.LocalDate;

public class Motor extends Barco {

    private double potenciaCV;

    public Motor() {
    }

    public Motor(double potenciaCV, String matricula, int eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Potencia CV: " + potenciaCV;
    }

    public void crearMotor(Motor m1) {
        super.crearBarco(m1);
        System.out.println("Ingrese la potencia en CV:");
        m1.setPotenciaCV(leer.nextDouble());
        System.out.println("--------------Barco Ingresado--------------");
    }

}
