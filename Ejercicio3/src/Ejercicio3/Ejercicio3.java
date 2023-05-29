package Ejercicio3;

import entidades.Electrodomesticos;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
         */

        List<Electrodomesticos> electro = new ArrayList<>();

        Electrodomesticos e1 = new Lavadora(35d, 1000d, "Blanco", 'C', 85d);
        Electrodomesticos e2 = new Lavadora(15d, 1000d, "Negro", 'A', 30d);
        Electrodomesticos e3 = new Televisor(35d, true, 1000d, "Negro", 'B', 15d);
        Electrodomesticos e4 = new Televisor(60d, false, 1000d, "Azul", 'A', 20d);

        electro.add(e1);
        electro.add(e2);
        electro.add(e3);
        electro.add(e4);

        for (Electrodomesticos aux : electro) {
            aux.precioFinal();
        }
        int sL = 0;
        int sT = 0;
        System.out.println("LAVADORAS");
        for (Electrodomesticos aux : electro) {

            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;
                System.out.println(object);
                System.out.println("---------------------------");
                sL += object.getPrecio();
            }
        }
        System.out.println("TELEVISORES");
        for (Electrodomesticos aux : electro) {
            if (aux instanceof Televisor) {
                Televisor object = (Televisor) aux;
                System.out.println(object);
                System.out.println("---------------------------");
                sT += object.getPrecio();
            }
        }
        System.out.println("La suma de los Lavarropas es de: $" + sL);
        System.out.println("La suma de los Televisores es de: $" + sT);

        System.out.println("La suma total de los electrodomesticos es de: " + (sT + sL));

    }

}
