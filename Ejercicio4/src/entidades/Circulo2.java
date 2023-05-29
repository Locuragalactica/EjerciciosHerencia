package entidades;

import interfaces.calculosFormas;
import static interfaces.calculosFormas.P;

public class Circulo2 implements calculosFormas {

    private Double radio;

    public Circulo2() {
    }

    public Circulo2(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return P * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return P * (radio * 2);
    }

}
