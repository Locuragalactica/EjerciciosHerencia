package ejercicio1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
         */
        ArrayList<Animal> animales = new ArrayList<>();

        Animal A1 = new Perro("Pepe Chiquito", 10, "Chow Chow", "Dog Chow");
        A1.alimentarse();
        animales.add(A1);

        Animal A2 = new Gato("Flora", 5, "Naranjoso", "Whiskas");
        A2.alimentarse();
        animales.add(A2);

        Animal A3 = new Caballo("Fer Grandote", 25, "Percheron", "Alfalfa");
        A3.alimentarse();
        animales.add(A3);

        for (Animal aux : animales) {
            System.out.println(aux);
        }

    }

}
