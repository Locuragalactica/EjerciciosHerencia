package entidades;

import Enumeraciones.Color;
import java.util.Scanner;

public class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (!Character.toString(letra).matches("[A-F?]")) {
            this.consumo = 'F';
        }
    }

    public void comprobarColor(String color) {
        boolean esta = false;
        for (Color aux : Color.values()) {
            if (aux.toString().equalsIgnoreCase(color)) {
                esta = true;
            }
        }
        if (!esta) {
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        //System.out.println("PRECIO: ");
        setPrecio(1000d);
        System.out.print("COLOR: ");
        setColor(leer.next());
        comprobarColor(getColor());
        System.out.print("CONSUMO ENERGÉTICO: ");
        this.consumo = leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.print("PESO: ");
        this.peso = leer.nextDouble();
    }

    public void precioFinal() {
        switch (this.consumo) {
            case 'A':
                this.precio = precio + 1000d;
                break;
            case 'B':
                this.precio = precio + 800d;
                break;
            case 'C':
                this.precio = precio + 600d;
                break;
            case 'D':
                this.precio = precio + 500d;
                break;
            case 'E':
                this.precio = precio + 300d;
                break;
            default:
                this.precio = precio + 100d;
                break;
        }
        if (precio > 0 && precio < 20) {
            precio = precio + 100d;
        } else if (precio >= 20 && precio < 50) {
            precio = precio + 500d;
        } else if (precio >= 50 && precio < 80) {
            precio = precio + 800d;
        } else {
            precio = precio + 1000d;
        }
    }

    public void mostrar() {
        System.out.println("Precio: $" + precio
                + "\nColor: " + color
                + "\nConsumo tipo: " + consumo
                + "\nPeso: " + peso + " kg");
    }

    @Override
    public String toString() {
        return "Precio: $" + precio
                + "\nColor: " + color
                + "\nConsumo tipo: " + consumo
                + "\nPeso: " + peso + " kg";
    }

}
