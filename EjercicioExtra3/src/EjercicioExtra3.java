
import entidades.Alojamiento;
import entidades.ExtraHotelero.Camping;
import entidades.ExtraHotelero.Residencia;
import entidades.Hotel.Hotel;
import entidades.Hotel.Hotel4Estrellas;
import entidades.Hotel.Hotel5Estrellas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

public class EjercicioExtra3 {

    public static void main(String[] args) {
        /*
        Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
         */
        ArrayList<Hotel> listaHoteles = new ArrayList<>();
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();
        Hotel4Estrellas h1 = new Hotel4Estrellas('A', "Resto 4 Estrellas", 15, 10, 2, 3, 0d, "Hotel El Palomar 4*", "Direccion 4", "Localidad 4", "Gerente 4");
        h1.precioHab();

        Hotel5Estrellas h2 = new Hotel5Estrellas(3, 4, 4, 'A', "Resto Vip", 50, 10, 400, 6, 0d, "Hotel 5", "Hotel Sheraton 5*", "Locadlidad 5", "Gerente 5");
        h2.precioHab();

        Hotel5Estrellas h3 = new Hotel5Estrellas(7, 9, 2, 'A', "Resto Colosal", 150, 100, 700, 9, 0d, "Hotel Premium Leflue", "Direccion 6", "Locadlidad 6", "Gerente 6");
        h3.precioHab();

        Residencia r1 = new Residencia(20, true, true, true, 300, "Residencia Los Coman", "Direccion Residencia", "Localidad Residencia", "Gerente Residencia");

        Camping c1 = new Camping(100, 10, true, true, 150, "Camping El Azul", "Direccion Camping", "Localidad Camping", "Gerente Camping");

        listaAlojamientos.add(h1);
        listaAlojamientos.add(h2);
        listaAlojamientos.add(r1);
        listaAlojamientos.add(c1);
        listaAlojamientos.add(h3);

        for (Alojamiento aux : listaAlojamientos) {
            if (aux instanceof Hotel) {
                Hotel object = (Hotel) aux;
                listaHoteles.add(object);
            }
        }

        Scanner leer = new Scanner(System.in);
        int rta;
        String rta2 = "";
        do {
            System.out.println("\u001B[41m ----------MENU----------");
            System.out.println("\u001B[41m");
            System.out.println("\u001B[41m1- Ver Todos los Alojamientos ");
            System.out.println("\u001B[41m2- Ordenar Hoteles por precio (mas cargo a mas barato)");
            System.out.println("\u001B[41m3- Campings con Restaurante");
            System.out.println("\u001B[41m4- Residencias con descuento Gremial");
            System.out.println("\u001B[41m5- Salir");

            rta = leer.nextInt();
            if (rta == 5) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("TODOS LOS ALOJAMIENTOS");
                    for (Alojamiento aux : listaAlojamientos) {
                        System.out.println(aux);
                    }
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("HOTEL DE CARO A BARATO");
                    Collections.sort(listaHoteles, Comparadores.OrdenarPrecio);
                    for (Hotel aux : listaHoteles) {
                        System.out.println(aux);
                    }
                    System.out.println("-------------------------------------");

                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("CAMPING CON RESTAURANTE");
                    for (Alojamiento aux : listaAlojamientos) {
                        if (aux instanceof Camping) {
                            Camping object = (Camping) aux;
                            if (object.isRestarante()) {
                                System.out.println(object);
                            }
                        }
                    }
                    System.out.println("-------------------------------------");

                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("RESIDENCIAS CON DESCUENTO");
                    for (Alojamiento aux : listaAlojamientos) {
                        if (aux instanceof Residencia) {
                            Residencia object = (Residencia) aux;
                            if (object.isDescGrem()) {
                                System.out.println(object);
                            }
                        }
                    }
                    System.out.println("-------------------------------------");

                    break;
            }

        } while (!rta2.equals("s"));

    }

}
