package entidades;

import interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {

        return (base * altura);
    }

    @Override
    public Double calcularPerimetro() {

        return ((base + altura) * 2);
    }

}
